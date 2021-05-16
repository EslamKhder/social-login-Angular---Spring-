import { Component, OnInit } from '@angular/core';
import {FacebookLoginProvider, GoogleLoginProvider, SocialAuthService, SocialUser} from 'angularx-social-login';
import {SocialService} from '../../services/social.service';

@Component({
  selector: 'app-social',
  templateUrl: './social.component.html',
  styleUrls: ['./social.component.css']
})
export class SocialComponent implements OnInit {

  user: SocialUser;
  isLogin: boolean; // false
  constructor(private authService: SocialAuthService,
              private social: SocialService) { }

  ngOnInit(): void {
    this.authService.authState.subscribe(
      data => {
        this.isLogin = (data != null);
      }
    );
  }

  signInWithGoogle(): void {
    this.authService.signIn(GoogleLoginProvider.PROVIDER_ID).then(
      data => {
        this.social.loginWithGoogle(data.idToken).subscribe(
          res => {
            console.log(res);
          }
        );
      }
    );
  }

  signInWithFB(): void {
    this.authService.signIn(FacebookLoginProvider.PROVIDER_ID).then(
      data => {
        this.social.loginWithFacebook(data.authToken).subscribe(
          res => {
            console.log(res);
          }
        );
      }
    );
  }
  signOut(): void {
    this.authService.signOut();
  }
}
