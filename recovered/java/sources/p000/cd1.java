            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageManager;
            import android.content.pm.ResolveInfo;
            import android.graphics.Bitmap;
            import android.view.View;
            import io.sentry.android.core.AbstractC1245n0;
            import io.sentry.android.core.internal.threaddump.C1209a;
            import java.util.ArrayList;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 12 */    public final class cd1 implements jp1 {

                /* JADX INFO: renamed from: a */
                public int f2845a;

                /* JADX INFO: renamed from: b */
                public int f2846b;

                /* JADX INFO: renamed from: c */
                public final Object f2847c;

                public cd1(Bitmap bitmap, int i, int i2) {
/* 1 */             bitmap.getClass();
/* 7 */             this.f2847c = bitmap;
/* 9 */             this.f2845a = i;
/* 11 */            this.f2846b = i2;
                }

                /* JADX INFO: renamed from: a */
                public C1209a m1631a() {
/* 1 */             int i = this.f2846b;
/* 3 */             if (i < 0 || i >= this.f2845a) {
/* 24 */                return null;
                    }
/* 11 */            ArrayList arrayList = (ArrayList) this.f2847c;
/* 15 */            this.f2846b = i + 1;
/* 21 */            return (C1209a) arrayList.get(i);
                }

                /* JADX INFO: renamed from: b */
                public synchronized int m1632b() {
                    PackageInfo packageInfoM9214c;
/* 4 */             if (this.f2845a == 0) {
                        try {
/* 17 */                    packageInfoM9214c = g93.m3898a((Context) this.f2847c).m9214c(0, "com.google.android.gms");
                        } catch (PackageManager.NameNotFoundException e) {
/* 37 */                    AbstractC1245n0.m4889q("Metadata", "Failed to find package ".concat(e.toString()));
/* 40 */                    packageInfoM9214c = null;
                        }
/* 41 */                if (packageInfoM9214c != null) {
/* 45 */                    this.f2845a = packageInfoM9214c.versionCode;
                        }
                    }
/* 47 */            return this.f2845a;
                }

                /* JADX WARN: Code duplicated, block: B:21:0x0050 A[Catch: all -> 0x002e, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0007, B:9:0x0025, B:14:0x0030, B:16:0x0037, B:18:0x0049, B:26:0x006a, B:21:0x0050, B:23:0x0063, B:29:0x006e, B:33:0x007d), top: B:38:0x0001 }] */
                /* JADX WARN: Code duplicated, block: B:31:0x007b  */
                /* JADX WARN: Code duplicated, block: B:32:0x007c  */
                /* JADX INFO: renamed from: c */
                public synchronized int m1633c() {
                    List<ResolveInfo> listQueryBroadcastReceivers;
/* 2 */             int i = this.f2846b;
/* 4 */             if (i != 0) {
/* 7 */                 return i;
                    }
/* 10 */            Context context = (Context) this.f2847c;
/* 12 */            PackageManager packageManager = context.getPackageManager();
/* 36 */            if (g93.m3898a(context).f17850a.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
/* 42 */                AbstractC1245n0.m4876d("Metadata", "Google Play services missing or without correct permission.");
/* 35 */                return 0;
                    }
/* 53 */            int i2 = 1;
/* 54 */            if (j13.m5650l()) {
/* 85 */                Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
/* 90 */                intent.setPackage("com.google.android.gms");
/* 93 */                listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
/* 98 */                if (listQueryBroadcastReceivers != null) {
                        }
/* 115 */               AbstractC1245n0.m4889q("Metadata", "Failed to resolve IID implementation package, falling back");
/* 122 */               if (true != j13.m5650l()) {
/* 125 */                   i2 = 2;
                        }
/* 126 */               this.f2846b = i2;
/* 129 */               return i2;
                    }
/* 60 */            Intent intent2 = new Intent("com.google.android.c2dm.intent.REGISTER");
/* 65 */            intent2.setPackage("com.google.android.gms");
/* 68 */            List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
/* 72 */            if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
/* 85 */                Intent intent3 = new Intent("com.google.iid.TOKEN_REQUEST");
/* 90 */                intent3.setPackage("com.google.android.gms");
/* 93 */                listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent3, 0);
/* 98 */                if (listQueryBroadcastReceivers != null || listQueryBroadcastReceivers.isEmpty()) {
/* 115 */                   AbstractC1245n0.m4889q("Metadata", "Failed to resolve IID implementation package, falling back");
/* 122 */                   if (true != j13.m5650l()) {
/* 125 */                       i2 = 2;
                            }
/* 126 */                   this.f2846b = i2;
/* 129 */                   return i2;
                        }
/* 106 */               i2 = 2;
                    }
/* 107 */           this.f2846b = i2;
/* 110 */           return i2;
                }

                @Override // p000.jp1
                /* JADX INFO: renamed from: k */
                public m83 mo1634k(View view, m83 m83Var) {
/* 3 */             View view2 = (View) this.f2847c;
/* 12 */            int i = m83Var.f13660a.mo2970f(7).f13529b;
/* 14 */            int i2 = this.f2845a;
/* 16 */            if (i2 >= 0) {
/* 23 */                view2.getLayoutParams().height = i2 + i;
/* 29 */                view2.setLayoutParams(view2.getLayoutParams());
                    }
/* 47 */            view2.setPadding(view2.getPaddingLeft(), this.f2846b + i, view2.getPaddingRight(), view2.getPaddingBottom());
/* 50 */            return m83Var;
                }

/* 13 */        public cd1(ArrayList arrayList) {
/* 15 */            this.f2847c = arrayList;
/* 16 */            this.f2845a = arrayList.size();
                }

/* 16 */        public cd1(Context context) {
                    this.f2846b = 0;
                    this.f2847c = context;
                }

/* 17 */        public cd1(View view, int i, int i2) {
                    this.f2845a = i;
                    this.f2847c = view;
                    this.f2846b = i2;
                }
            }
