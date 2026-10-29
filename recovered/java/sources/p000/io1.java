            package p000;

            import android.app.Notification;
            import android.content.Context;
            import android.graphics.Bitmap;
            import android.os.Build;
            import androidx.core.graphics.drawable.IconCompat;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class io1 extends sq3 {

                /* JADX INFO: renamed from: b */
                public IconCompat f11870b;

                /* JADX INFO: renamed from: c */
                public IconCompat f11871c;

                /* JADX INFO: renamed from: d */
                public boolean f11872d;

                @Override // p000.sq3
                /* JADX INFO: renamed from: g */
                public final void mo5529g(ra2 ra2Var) {
                    Bitmap bitmapM585a;
/* 3 */             Notification.Builder builder = (Notification.Builder) ra2Var.f15956b;
/* 7 */             Context context = (Context) ra2Var.f15955a;
/* 15 */            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(null);
/* 19 */            IconCompat iconCompat = this.f11870b;
/* 23 */            if (iconCompat != null) {
/* 27 */                if (Build.VERSION.SDK_INT >= 31) {
/* 33 */                    ho1.m4250a(bigContentTitle, gv0.m4023g(iconCompat, context));
                        } else {
/* 37 */                    int iM4020d = iconCompat.f1246a;
/* 40 */                    if (iM4020d == -1) {
/* 44 */                        iM4020d = gv0.m4020d(iconCompat.f1247b);
                            }
/* 49 */                    if (iM4020d == 1) {
/* 51 */                        IconCompat iconCompat2 = this.f11870b;
/* 53 */                        int i = iconCompat2.f1246a;
/* 55 */                        if (i == -1) {
/* 57 */                            Object obj = iconCompat2.f1247b;
/* 66 */                            bitmapM585a = obj instanceof Bitmap ? (Bitmap) obj : null;
                                } else if (i == 1) {
/* 72 */                            bitmapM585a = (Bitmap) iconCompat2.f1247b;
                                } else {
/* 76 */                            if (i != 5) {
/* 93 */                                ds0.m3204u(iconCompat2, "called getBitmap() on ");
/* 96 */                                return;
                                    }
/* 82 */                            bitmapM585a = IconCompat.m585a((Bitmap) iconCompat2.f1247b, true);
                                }
/* 86 */                        bigContentTitle = bigContentTitle.bigPicture(bitmapM585a);
                            }
                        }
                    }
/* 99 */            if (this.f11872d) {
/* 101 */               IconCompat iconCompat3 = this.f11871c;
/* 103 */               if (iconCompat3 == null) {
/* 105 */                   bigContentTitle.bigLargeIcon((Bitmap) null);
                        } else {
/* 113 */                   go1.m3980a(bigContentTitle, gv0.m4023g(iconCompat3, context));
                        }
                    }
/* 118 */           if (Build.VERSION.SDK_INT >= 31) {
/* 121 */               ho1.m4252c(bigContentTitle, false);
/* 124 */               ho1.m4251b(bigContentTitle, null);
                    }
                }

                @Override // p000.sq3
                /* JADX INFO: renamed from: i */
                public final String mo5530i() {
/* 1 */             return "androidx.core.app.NotificationCompat$BigPictureStyle";
                }
            }
