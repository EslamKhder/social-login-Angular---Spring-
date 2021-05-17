import { Component, OnInit } from '@angular/core';
import {StudentService} from '../../services/student.service';
import {map} from 'rxjs/operators';
import {Student} from '../../model/student';

@Component({
  selector: 'app-students',
  templateUrl: './students.component.html',
  styleUrls: ['./students.component.css']
})
export class StudentsComponent implements OnInit {

  students: Student[] = [];
  constructor(private stu: StudentService) { }

  ngOnInit(): void {
    this.getAllStudent()
  }

  getAllStudent(){
    this.stu.getStudents().subscribe(
      data =>{
        this.students = data
      }
    )
  }

}
