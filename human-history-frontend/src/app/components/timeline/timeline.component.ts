import { Component, OnInit } from '@angular/core';
import TimelineData from '../../../assets/timelineData.json'

@Component({
  selector: 'app-timeline',
  templateUrl: './timeline.component.html',
  styleUrls: ['./timeline.component.css']
})
export class TimelineComponent implements OnInit {
  timelineData: any = TimelineData;

  constructor() { }

  ngOnInit(): void {

  }

  trimString(text: string): string{
    var maxLength = 150; // maximum number of characters to extract
    var trimmedString = text.substr(0, maxLength);//trim the string to the maximum length
    //re-trim if we are in the middle of a word
    trimmedString = trimmedString.substr(0, Math.min(trimmedString.length, trimmedString.lastIndexOf(" ")))
    return trimmedString + "...";
  }

}
