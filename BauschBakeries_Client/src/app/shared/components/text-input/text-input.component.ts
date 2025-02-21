import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-text-input',
  imports: [],
  templateUrl: './text-input.component.html',
  styleUrl: './text-input.component.scss'
})
export class TextInputComponent {
  @Input() name = "";
  @Input() type = "";
  @Input() placeholder = "placeholder";
  @Input() label ="";
}
