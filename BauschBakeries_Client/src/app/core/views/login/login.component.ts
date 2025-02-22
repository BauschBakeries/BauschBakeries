import { Component } from '@angular/core';
import { ButtonComponent } from '@Shared/components/button/button.component';
import { CardComponent } from "@Shared/components/card/card.component";
import { TextInputComponent } from "@Shared/components/text-input/text-input.component";
import { FooterComponent } from "@Components/footer/footer.component";
import { CheckboxComponent } from "@Shared/components/checkbox/checkbox.component";
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { faChevronRight } from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'app-login',
  imports: [
    CardComponent,
    TextInputComponent,
    ButtonComponent, 
    FooterComponent, 
    CheckboxComponent,
    FontAwesomeModule
  ],
  templateUrl: './login.component.html',
  styleUrl: './login.component.scss',
})
export class LoginComponent {
  faChevronRight = faChevronRight;
}
