@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
        Program program = new Program();
        boolean isAdult = program.checkIsAdult(19);
        assertEquals("Проверка на возраст не пройдена", true, isAdult);
// Напиши код здесь
}