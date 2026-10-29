            package androidx.viewpager.widget;

            import android.database.DataSetObservable;
            import android.database.DataSetObserver;
            import android.os.Parcelable;
            import android.view.View;
            import android.view.ViewGroup;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 3 */     public abstract class PagerAdapter {
                public static final int POSITION_NONE = -2;
                public static final int POSITION_UNCHANGED = -1;
                private final DataSetObservable mObservable = new DataSetObservable();
                private DataSetObserver mViewPagerObserver;

                @Deprecated
                public void destroyItem(View view, int i, Object obj) {
/* 8 */             throw new UnsupportedOperationException("Required method destroyItem was not overridden");
                }

                public void finishUpdate(ViewGroup viewGroup) {
/* 1 */             finishUpdate((View) viewGroup);
                }

                public abstract int getCount();

                public int getItemPosition(Object obj) {
/* 1 */             return -1;
                }

                public CharSequence getPageTitle(int i) {
/* 1 */             return null;
                }

                public float getPageWidth(int i) {
/* 1 */             return 1.0f;
                }

                @Deprecated
                public Object instantiateItem(View view, int i) {
/* 8 */             throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
                }

                public abstract boolean isViewFromObject(View view, Object obj);

                public void notifyDataSetChanged() {
                    synchronized (this) {
                        try {
/* 2 */                     DataSetObserver dataSetObserver = this.mViewPagerObserver;
/* 4 */                     if (dataSetObserver != null) {
/* 6 */                         dataSetObserver.onChanged();
                            }
                        } catch (Throwable th) {
/* 20 */                    throw th;
                        }
                    }
/* 15 */            this.mObservable.notifyChanged();
                }

                public void registerDataSetObserver(DataSetObserver dataSetObserver) {
/* 3 */             this.mObservable.registerObserver(dataSetObserver);
                }

                public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
                }

                public Parcelable saveState() {
/* 1 */             return null;
                }

                public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
/* 1 */             setPrimaryItem((View) viewGroup, i, obj);
                }

                public void setViewPagerObserver(DataSetObserver dataSetObserver) {
                    synchronized (this) {
/* 2 */                 this.mViewPagerObserver = dataSetObserver;
                    }
                }

                public void startUpdate(ViewGroup viewGroup) {
/* 1 */             startUpdate((View) viewGroup);
                }

                public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
/* 3 */             this.mObservable.unregisterObserver(dataSetObserver);
                }

                @Deprecated
/* 4 */         public void finishUpdate(View view) {
                }

                @Deprecated
/* 4 */         public void setPrimaryItem(View view, int i, Object obj) {
                }

                @Deprecated
/* 4 */         public void startUpdate(View view) {
                }

/* 8 */         public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
/* 9 */             destroyItem((View) viewGroup, i, obj);
                }

/* 8 */         public Object instantiateItem(ViewGroup viewGroup, int i) {
/* 9 */             return instantiateItem((View) viewGroup, i);
                }
            }
