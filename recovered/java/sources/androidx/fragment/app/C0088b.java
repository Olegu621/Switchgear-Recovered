            package androidx.fragment.app;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            
            /* JADX INFO: renamed from: androidx.fragment.app.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0088b implements Parcelable.Creator {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f1404a;

                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    switch (this.f1404a) {
                        case 0:
/* 117 */                   return new BackStackRecordState(parcel);
                        case 1:
/* 111 */                   return new BackStackState(parcel);
                        case 2:
/* 93 */                    FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = new FragmentManager$LaunchedFragmentInfo();
/* 100 */                   fragmentManager$LaunchedFragmentInfo.f1357a = parcel.readString();
/* 106 */                   fragmentManager$LaunchedFragmentInfo.f1358b = parcel.readInt();
/* 108 */                   return fragmentManager$LaunchedFragmentInfo;
                        case 3:
/* 14 */                    FragmentManagerState fragmentManagerState = new FragmentManagerState();
/* 18 */                    fragmentManagerState.f1363e = null;
/* 25 */                    fragmentManagerState.f1364f = new ArrayList();
/* 32 */                    fragmentManagerState.f1365i = new ArrayList();
/* 38 */                    fragmentManagerState.f1359a = parcel.createStringArrayList();
/* 44 */                    fragmentManagerState.f1360b = parcel.createStringArrayList();
/* 54 */                    fragmentManagerState.f1361c = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
/* 60 */                    fragmentManagerState.f1362d = parcel.readInt();
/* 66 */                    fragmentManagerState.f1363e = parcel.readString();
/* 72 */                    fragmentManagerState.f1364f = parcel.createStringArrayList();
/* 80 */                    fragmentManagerState.f1365i = parcel.createTypedArrayList(BackStackState.CREATOR);
/* 88 */                    fragmentManagerState.f1366v = parcel.createTypedArrayList(FragmentManager$LaunchedFragmentInfo.CREATOR);
/* 90 */                    return fragmentManagerState;
                        default:
/* 8 */                     return new FragmentState(parcel);
                    }
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    switch (this.f1404a) {
                        case 0:
/* 18 */                    return new BackStackRecordState[i];
                        case 1:
/* 15 */                    return new BackStackState[i];
                        case 2:
/* 12 */                    return new FragmentManager$LaunchedFragmentInfo[i];
                        case 3:
/* 9 */                     return new FragmentManagerState[i];
                        default:
/* 6 */                     return new FragmentState[i];
                    }
                }
            }
