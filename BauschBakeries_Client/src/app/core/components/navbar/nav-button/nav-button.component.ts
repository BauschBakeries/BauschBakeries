import { Component, EventEmitter, Input, Output, OnInit } from '@angular/core';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-nav-button',
  imports: [RouterModule],
  templateUrl: './nav-button.component.html',
  styleUrl: './nav-button.component.scss',
})
export class NavButtonComponent implements OnInit {
  @Input() label = 'Button';
  @Input() routerLink?: string | any[];
  @Input() disabled = false;
  @Input() type: 'button' | 'submit' | 'reset' = 'button';
  @Input() importantButton = false;

  @Output() clicked = new EventEmitter<void>();

  ngOnInit() {
    // this is here so that we can still have icon + text buttons, but also only icon buttons without the
    // hassle of trying to import fontawesome
    // 500 places over and over again
    if (this.label == 'VOID') {
      this.label = '';
    }
  }

  handleClick() {
    if (!this.routerLink) {
      this.clicked.emit();
    }
  }
}
