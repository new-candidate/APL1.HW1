package ru.geekbrains.apl1hw1;

class Presenter {

    private Model model = new Model();
    private MainView view;

    void bindView(MainView view){
        this.view = view;
        updateView();
    }

    void unbindView(MainView view)
    {
        if(view == this.view) this.view = null;
    }

    private void updateView(){
        if(view == null) return;

        for(int i = 0 ; i < model.getElementsCount(); i++){
            view.setButtonText(i, model.getElementValueAtIndex(i));
        }
    }

    void buttonClick(int index){
        if(model == null) return;
        int newModelValue = model.getElementValueAtIndex(index) + 1;
        model.setElementValueAtIndex(index, newModelValue);
        if(view == null) return;
        view.setButtonText(index, newModelValue);
    }
}
