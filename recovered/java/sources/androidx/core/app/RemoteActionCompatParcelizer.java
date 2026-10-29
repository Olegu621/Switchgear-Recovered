            package androidx.core.app;

            import android.app.PendingIntent;
            import android.os.Parcel;
            import android.text.TextUtils;
            import androidx.core.graphics.drawable.IconCompat;
            import p000.h23;
            import p000.i23;
            import p000.j23;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class RemoteActionCompatParcelizer {
                public static RemoteActionCompat read(h23 h23Var) {
/* 3 */             RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
/* 6 */             j23 j23VarM4094h = remoteActionCompat.f1237a;
/* 8 */             boolean z = true;
/* 13 */            if (h23Var.mo4091e(1)) {
/* 16 */                j23VarM4094h = h23Var.m4094h();
                    }
/* 22 */            remoteActionCompat.f1237a = (IconCompat) j23VarM4094h;
/* 24 */            CharSequence charSequence = remoteActionCompat.f1238b;
/* 31 */            if (h23Var.mo4091e(2)) {
/* 45 */                charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((i23) h23Var).f9423e);
                    }
/* 47 */            remoteActionCompat.f1238b = charSequence;
/* 49 */            CharSequence charSequence2 = remoteActionCompat.f1239c;
/* 56 */            if (h23Var.mo4091e(3)) {
/* 70 */                charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((i23) h23Var).f9423e);
                    }
/* 72 */            remoteActionCompat.f1239c = charSequence2;
/* 83 */            remoteActionCompat.f1240d = (PendingIntent) h23Var.m4093g(remoteActionCompat.f1240d, 4);
/* 85 */            boolean z2 = remoteActionCompat.f1241e;
/* 93 */            if (h23Var.mo4091e(5)) {
/* 109 */               z2 = ((i23) h23Var).f9423e.readInt() != 0;
                    }
/* 110 */           remoteActionCompat.f1241e = z2;
/* 112 */           boolean z3 = remoteActionCompat.f1242f;
/* 119 */           if (!h23Var.mo4091e(6)) {
/* 121 */               z = z3;
                    } else if (((i23) h23Var).f9423e.readInt() == 0) {
/* 134 */               z = false;
                    }
/* 135 */           remoteActionCompat.f1242f = z;
/* 137 */           return remoteActionCompat;
                }

                public static void write(RemoteActionCompat remoteActionCompat, h23 h23Var) {
/* 1 */             h23Var.getClass();
/* 4 */             IconCompat iconCompat = remoteActionCompat.f1237a;
/* 7 */             h23Var.mo4095i(1);
/* 10 */            h23Var.m4097k(iconCompat);
/* 13 */            CharSequence charSequence = remoteActionCompat.f1238b;
/* 16 */            h23Var.mo4095i(2);
/* 22 */            Parcel parcel = ((i23) h23Var).f9423e;
/* 25 */            TextUtils.writeToParcel(charSequence, parcel, 0);
/* 28 */            CharSequence charSequence2 = remoteActionCompat.f1239c;
/* 31 */            h23Var.mo4095i(3);
/* 34 */            TextUtils.writeToParcel(charSequence2, parcel, 0);
/* 37 */            PendingIntent pendingIntent = remoteActionCompat.f1240d;
/* 40 */            h23Var.mo4095i(4);
/* 43 */            parcel.writeParcelable(pendingIntent, 0);
/* 46 */            boolean z = remoteActionCompat.f1241e;
/* 49 */            h23Var.mo4095i(5);
/* 52 */            parcel.writeInt(z ? 1 : 0);
/* 55 */            boolean z2 = remoteActionCompat.f1242f;
/* 58 */            h23Var.mo4095i(6);
/* 61 */            parcel.writeInt(z2 ? 1 : 0);
                }
            }
