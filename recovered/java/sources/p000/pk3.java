            package p000;

            import com.google.android.gms.internal.measurement.zzmq;
            import com.google.android.recaptcha.internal.zzsw;
            import com.google.android.recaptcha.internal.zzsx;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class pk3 {
                /* JADX INFO: renamed from: a */
                public static /* synthetic */ void m7465a() throws zzsw {
/* 8 */             throw new zzsw("Protocol message tag had invalid wire type.");
                }

                /* JADX INFO: renamed from: b */
                public static /* synthetic */ void m7466b(int i, int i2) {
/* 3 */             StringBuilder sb = new StringBuilder(i);
/* 8 */             sb.append((Object) "serialized size must be non-negative, was ");
/* 11 */            sb.append(i2);
/* 23 */            throw new IllegalStateException(sb.toString());
                }

                /* JADX INFO: renamed from: c */
                public static /* synthetic */ void m7467c(int i, int i2, int i3) {
/* 3 */             StringBuilder sb = new StringBuilder(i);
/* 8 */             sb.append((Object) "Ran off end of other: 0, ");
/* 11 */            sb.append(i2);
/* 16 */            sb.append((Object) ", ");
/* 19 */            sb.append(i3);
/* 31 */            throw new IllegalArgumentException(sb.toString());
                }

                /* JADX INFO: renamed from: d */
                public static /* synthetic */ void m7468d(int i, Object obj) {
/* 32 */            throw new IllegalStateException("Source subfield " + i + ((Object) " is present but null: ") + ((Object) obj.toString()));
                }

                /* JADX INFO: renamed from: e */
                public static /* synthetic */ void m7469e(int i, Object obj, int i2) {
/* 3 */             StringBuilder sb = new StringBuilder(i);
/* 8 */             sb.append((Object) "Source subfield ");
/* 11 */            sb.append(i2);
/* 16 */            sb.append((Object) " is present but null: ");
/* 19 */            sb.append(obj);
/* 31 */            throw new IllegalStateException(sb.toString());
                }

                /* JADX INFO: renamed from: f */
                public static /* synthetic */ void m7470f(int i, Object obj, int i2, Object obj2, int i3) {
/* 3 */             StringBuilder sb = new StringBuilder(i);
/* 6 */             sb.append(obj);
/* 9 */             sb.append(i2);
/* 12 */            sb.append(obj2);
/* 15 */            sb.append(i3);
/* 27 */            throw new IndexOutOfBoundsException(sb.toString());
                }

                /* JADX INFO: renamed from: g */
                public static /* synthetic */ void m7471g(long j) {
/* 20 */            throw new IllegalArgumentException("UTF-8 length does not fit in int: " + j);
                }

                /* JADX INFO: renamed from: h */
                public static /* synthetic */ void m7472h(String str) throws zzmq {
/* 6 */             throw new zzmq(str);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: i */
                public static /* synthetic */ void m7473i(int i, int i2) {
/* 28 */            throw new ArrayIndexOutOfBoundsException("Failed writing " + ((char) i) + ((Object) " at index ") + i2);
                }

                /* JADX INFO: renamed from: j */
                public static /* synthetic */ void m7474j(int i, int i2, int i3) {
/* 3 */             StringBuilder sb = new StringBuilder(i);
/* 8 */             sb.append((Object) "Length too large: ");
/* 11 */            sb.append(i2);
/* 14 */            sb.append(i3);
/* 26 */            throw new IllegalArgumentException(sb.toString());
                }

                /* JADX INFO: renamed from: k */
                public static /* synthetic */ void m7475k(String str) throws zzsx {
/* 6 */             throw new zzsx(str);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: l */
                public static /* synthetic */ void m7476l(int i, int i2, int i3) {
/* 3 */             StringBuilder sb = new StringBuilder(i);
/* 8 */             sb.append((Object) "Failed writing ");
/* 11 */            sb.append((char) i2);
/* 16 */            sb.append((Object) " at index ");
/* 19 */            sb.append(i3);
/* 31 */            throw new ArrayIndexOutOfBoundsException(sb.toString());
                }
            }
