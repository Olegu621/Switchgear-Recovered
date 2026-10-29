            package p000;

            import android.os.Parcel;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class g62 extends RuntimeException {
                public g62(String str, Parcel parcel) {
/* 1 */             int iDataPosition = parcel.dataPosition();
/* 5 */             int iDataSize = parcel.dataSize();
/* 9 */             int length = str.length();
/* 37 */            StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(iDataPosition).length() + 6 + String.valueOf(iDataSize).length());
/* 40 */            sb.append(str);
/* 45 */            sb.append(" Parcel: pos=");
/* 48 */            sb.append(iDataPosition);
/* 53 */            sb.append(" size=");
/* 56 */            sb.append(iDataSize);
/* 63 */            super(sb.toString());
                }
            }
