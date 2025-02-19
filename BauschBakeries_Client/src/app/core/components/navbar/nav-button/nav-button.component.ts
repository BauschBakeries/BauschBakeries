import { Component, EventEmitter, Input, Output } from '@angular/core';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-nav-button',
  imports: [RouterModule],
  templateUrl: './nav-button.component.html',
  styleUrl: './nav-button.component.scss'
})
export class NavButtonComponent {
  @Input() label: string = 'Button';
  @Input() routerLink?: string | any[];
  @Input() disabled: boolean = false;
  @Input() type: 'button' | 'submit' | 'reset' = 'button';
  @Input() importantButton: boolean = false;

  @Output() clicked = new EventEmitter<void>();

  ngOnInit() {
    // this is here so that we can still have icon + text buttons, but also only icon buttons without the
    // hassle of trying to import fontawesome
    // 500 places over and over again
    if (this.label == "VOID") {
      this.label = "";
    }
  }

  handleClick() {
    if (!this.routerLink) {
      this.clicked.emit();
    }
  }
}
