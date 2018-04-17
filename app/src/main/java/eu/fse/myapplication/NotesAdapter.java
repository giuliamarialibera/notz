package eu.fse.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.LayoutInflater;

import java.util.ArrayList;

/**
 * Created by Amministratore on 12/04/2018.
 */

public class NotesAdapter extends RecyclerView.Adapter<NotesAdapter.ViewHolder> {

    private ArrayList<Note> mDataset;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView titleTv;
        public TextView descriptionTv;
        public ViewHolder(View itemView) {
            super(itemView);
            titleTv = (TextView) itemView.findViewById(R.id.title_tv);
            titleTv = (TextView) itemView.findViewById(R.id.description_tv);
        }
    }

    public NotesAdapter(ArrayList<Note> myDataset) {
        mDataset = myDataset;
    }



    public NotesAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_note, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(NotesAdapter.ViewHolder holder, int position) {

        NotesAdapter.ViewHolder noteVH = (NotesAdapter.ViewHolder)holder;
        Note currentNote = mDataset.get(position);
        holder.titleTv.setText(currentNote.getTitle());
        holder.descriptionTv.setText(currentNote.getDescription());
    }


    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}

