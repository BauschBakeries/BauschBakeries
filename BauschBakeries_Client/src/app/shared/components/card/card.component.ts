import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrl: './card.component.scss',
})
export class CardComponent  {
  @Input() title = 'Card Title - Replace Me';
  @Input() titleWidthFull = false;
  @Output() clicked = new EventEmitter<void>();
}
