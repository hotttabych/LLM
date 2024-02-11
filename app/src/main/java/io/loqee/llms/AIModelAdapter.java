package io.loqee.llms;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AIModelAdapter extends ArrayAdapter<AIModel> {

    public AIModelAdapter(@NonNull Context context, int resource, @NonNull List<AIModel> aiModels) {
        super(context, resource, aiModels);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_layout, parent, false);
        }

        AIModel aiModel = getItem(position);

        TextView name = convertView.findViewById(R.id.name);
        TextView developer = convertView.findViewById(R.id.developer);
        TextView properties = convertView.findViewById(R.id.properties);
        TextView year = convertView.findViewById(R.id.year);

        name.setText(aiModel.getName());
        developer.setText(aiModel.getDeveloper());
        properties.setText(aiModel.getProperties());
        year.setText(aiModel.getYear());

        return convertView;
    }
}
