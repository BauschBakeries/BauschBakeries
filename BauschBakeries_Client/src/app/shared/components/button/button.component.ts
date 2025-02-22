import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-button',
  imports: [],
  templateUrl: './button.component.html',
  styleUrl: './button.component.scss',
})
export class ButtonComponent implements OnInit {
  @Input() label = 'Button Label - Replace Me';
  @Input() textSize = "text-2xl";

  ngOnInit() {
    if (this.label === "VOID") {
      this.label = "";
    }
  }
}
