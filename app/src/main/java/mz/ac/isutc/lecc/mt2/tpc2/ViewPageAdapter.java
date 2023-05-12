package mz.ac.isutc.lecc.mt2.tpc2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import mz.ac.isutc.lecc.mt2.tpc2.fragments.EstudanteFragment;
import mz.ac.isutc.lecc.mt2.tpc2.fragments.ListFragment;
import mz.ac.isutc.lecc.mt2.tpc2.fragments.SettingsFragment;

public class ViewPageAdapter extends FragmentStateAdapter {
    public ViewPageAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                return new EstudanteFragment();
            case 1:
                return new ListFragment();
            case 2:
                return new SettingsFragment();
            default:
                return new ListFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
