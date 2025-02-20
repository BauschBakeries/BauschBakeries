import { Component, EventEmitter, Input, Output, OnInit } from '@angular/core';
import { ButtonComponent } from "../button/button.component";

@Component({
  selector: 'app-card',
  imports: [ButtonComponent],
  templateUrl: './card.component.html',
  styleUrl: './card.component.scss',
})
export class CardComponent implements OnInit {
  @Input() title = 'Card Title - Replace Me';
  @Input() titleWidthFull: boolean = false;
  @Output() clicked = new EventEmitter<void>();

  ngOnInit() {}
}
