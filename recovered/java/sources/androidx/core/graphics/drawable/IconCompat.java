            package androidx.core.graphics.drawable;

            import android.content.res.ColorStateList;
            import android.graphics.Bitmap;
            import android.graphics.BitmapShader;
            import android.graphics.Canvas;
            import android.graphics.Matrix;
            import android.graphics.Paint;
            import android.graphics.PorterDuff;
            import android.graphics.Shader;
            import android.net.Uri;
            import android.os.Parcelable;
            import androidx.versionedparcelable.CustomVersionedParcelable;
            import p000.C1951n4;
            import p000.ds0;
            import p000.gv0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class IconCompat extends CustomVersionedParcelable {

                /* JADX INFO: renamed from: k */
                public static final PorterDuff.Mode f1245k = PorterDuff.Mode.SRC_IN;

                /* JADX INFO: renamed from: a */
                public int f1246a;

                /* JADX INFO: renamed from: b */
                public Object f1247b;

                /* JADX INFO: renamed from: c */
                public byte[] f1248c = null;

                /* JADX INFO: renamed from: d */
                public Parcelable f1249d = null;

                /* JADX INFO: renamed from: e */
                public int f1250e = 0;

                /* JADX INFO: renamed from: f */
                public int f1251f = 0;

                /* JADX INFO: renamed from: g */
                public ColorStateList f1252g = null;

                /* JADX INFO: renamed from: h */
                public PorterDuff.Mode f1253h = f1245k;

                /* JADX INFO: renamed from: i */
                public String f1254i = null;

                /* JADX INFO: renamed from: j */
                public String f1255j;

                public IconCompat(int i) {
/* 22 */            this.f1246a = i;
                }

                /* JADX INFO: renamed from: a */
                public static Bitmap m585a(Bitmap bitmap, boolean z) {
/* 18 */            int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
/* 21 */            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
/* 27 */            Canvas canvas = new Canvas(bitmapCreateBitmap);
/* 33 */            Paint paint = new Paint(3);
                    float f = iMin;
/* 39 */            float f2 = 0.5f * f;
/* 43 */            float f3 = 0.9166667f * f2;
/* 44 */            if (z) {
/* 49 */                float f4 = 0.010416667f * f;
/* 51 */                paint.setColor(0);
/* 61 */                paint.setShadowLayer(f4, 0.0f, f * 0.020833334f, 1023410176);
/* 64 */                canvas.drawCircle(f2, f2, f3, paint);
/* 69 */                paint.setShadowLayer(f4, 0.0f, 0.0f, 503316480);
/* 72 */                canvas.drawCircle(f2, f2, f3, paint);
/* 75 */                paint.clearShadowLayer();
                    }
/* 80 */            paint.setColor(-16777216);
/* 85 */            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
/* 87 */            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
/* 92 */            Matrix matrix = new Matrix();
/* 113 */           matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
/* 116 */           bitmapShader.setLocalMatrix(matrix);
/* 119 */           paint.setShader(bitmapShader);
/* 122 */           canvas.drawCircle(f2, f2, f3, paint);
/* 126 */           canvas.setBitmap(null);
/* 129 */           return bitmapCreateBitmap;
                }

                /* JADX INFO: renamed from: b */
                public static IconCompat m586b(int i, String str) {
/* 1 */             str.getClass();
/* 4 */             if (i == 0) {
/* 21 */                C1951n4.m6859j("Drawable resource ID must not be 0");
/* 24 */                return null;
                    }
/* 9 */             IconCompat iconCompat = new IconCompat(2);
/* 12 */            iconCompat.f1250e = i;
/* 14 */            iconCompat.f1247b = str;
/* 16 */            iconCompat.f1255j = str;
/* 18 */            return iconCompat;
                }

                /* JADX INFO: renamed from: c */
                public final int m587c() {
/* 1 */             int i = this.f1246a;
/* 4 */             if (i == -1) {
/* 8 */                 return gv0.m4018b(this.f1247b);
                    }
/* 14 */            if (i == 2) {
/* 16 */                return this.f1250e;
                    }
/* 21 */            ds0.m3204u(this, "called getResId() on ");
/* 24 */            return 0;
                }

                /* JADX INFO: renamed from: d */
                public final Uri m588d() {
/* 1 */             int i = this.f1246a;
/* 4 */             if (i == -1) {
/* 8 */                 return gv0.m4021e(this.f1247b);
                    }
/* 14 */            if (i == 4 || i == 6) {
/* 31 */                return Uri.parse((String) this.f1247b);
                    }
/* 22 */            ds0.m3204u(this, "called getUri() on ");
/* 25 */            return null;
                }

                public final String toString() {
                    String str;
/* 4 */             if (this.f1246a == -1) {
/* 8 */                 return String.valueOf(this.f1247b);
                    }
/* 17 */            StringBuilder sb = new StringBuilder("Icon(typ=");
                    switch (this.f1246a) {
                        case 1:
/* 43 */                    str = "BITMAP";
                            break;
                        case 2:
/* 40 */                    str = "RESOURCE";
                            break;
                        case 3:
/* 37 */                    str = "DATA";
                            break;
                        case 4:
/* 34 */                    str = "URI";
                            break;
                        case 5:
/* 31 */                    str = "BITMAP_MASKABLE";
                            break;
                        case 6:
/* 28 */                    str = "URI_MASKABLE";
                            break;
                        default:
/* 25 */                    str = "UNKNOWN";
                            break;
                    }
/* 45 */            sb.append(str);
                    switch (this.f1246a) {
                        case 1:
                        case 5:
/* 129 */                   sb.append(" size=");
/* 140 */                   sb.append(((Bitmap) this.f1247b).getWidth());
/* 145 */                   sb.append("x");
/* 156 */                   sb.append(((Bitmap) this.f1247b).getHeight());
                            break;
                        case 2:
/* 92 */                    sb.append(" pkg=");
/* 97 */                    sb.append(this.f1255j);
/* 102 */                   sb.append(" id=");
/* 123 */                   sb.append(String.format("0x%08x", Integer.valueOf(m587c())));
                            break;
                        case 3:
/* 67 */                    sb.append(" len=");
/* 72 */                    sb.append(this.f1250e);
/* 77 */                    if (this.f1251f != 0) {
/* 81 */                        sb.append(" off=");
/* 86 */                        sb.append(this.f1251f);
                            }
                            break;
                        case 4:
                        case 6:
/* 56 */                    sb.append(" uri=");
/* 61 */                    sb.append(this.f1247b);
                            break;
                    }
/* 161 */           if (this.f1252g != null) {
/* 165 */               sb.append(" tint=");
/* 170 */               sb.append(this.f1252g);
                    }
/* 177 */           if (this.f1253h != f1245k) {
/* 181 */               sb.append(" mode=");
/* 186 */               sb.append(this.f1253h);
                    }
/* 191 */           sb.append(")");
/* 194 */           return sb.toString();
                }
            }
