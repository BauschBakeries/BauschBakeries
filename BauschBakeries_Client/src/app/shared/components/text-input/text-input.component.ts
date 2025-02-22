import { CommonModule } from '@angular/common';
import { Component, Input } from '@angular/core';
import { FaIconLibrary } from '@fortawesome/angular-fontawesome';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { faEye, faEyeSlash } from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'app-text-input',
  standalone: true,
  imports: [CommonModule, FontAwesomeModule],
  templateUrl: './text-input.component.html',
  styleUrls: ['./text-input.component.scss'],
})
export class TextInputComponent {
  @Input() name = '';
  @Input() type = '';
  @Input() placeholder = 'placeholder';
  @Input() label = '';

  showPassword = false;
  faEye = faEye;
  faEyeSlash = faEyeSlash;

  constructor(private library: FaIconLibrary) {
    library.addIcons(faEye, faEyeSlash);
  }

  togglePasswordVisibility(inputElement: HTMLInputElement) {
    this.showPassword = !this.showPassword;
    inputElement.type = this.showPassword ? 'text' : 'password';
  }
}
