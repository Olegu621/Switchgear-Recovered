            package p000;

            import android.app.ActivityOptions;
            import android.content.Intent;
            import android.os.Build;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.Parcelable;
            import android.text.TextUtils;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 57 */    public final class i30 {

                /* JADX INFO: renamed from: a */
                public final Intent f9432a;

                /* JADX INFO: renamed from: b */
                public final dc0 f9433b;

                /* JADX INFO: renamed from: c */
                public ArrayList f9434c;

                /* JADX INFO: renamed from: d */
                public ActivityOptions f9435d;

                /* JADX INFO: renamed from: e */
                public Bundle f9436e;

                /* JADX INFO: renamed from: f */
                public int f9437f;

                /* JADX INFO: renamed from: g */
                public boolean f9438g;

                public i30(o30 o30Var) {
/* 8 */             Intent intent = new Intent("android.intent.action.VIEW");
/* 11 */            this.f9432a = intent;
/* 20 */            this.f9433b = new dc0(27);
/* 23 */            this.f9437f = 0;
/* 26 */            this.f9438g = true;
/* 28 */            if (o30Var != null) {
/* 36 */                intent.setPackage(o30Var.f14602d.getPackageName());
/* 41 */                IBinder iBinderAsBinder = o30Var.f14601c.asBinder();
/* 47 */                Bundle bundle = new Bundle();
/* 52 */                bundle.putBinder("android.support.customtabs.extra.SESSION", iBinderAsBinder);
/* 55 */                intent.putExtras(bundle);
                    }
                }

                /* JADX INFO: renamed from: a */
                public final j30 m4451a() {
/* 1 */             Intent intent = this.f9432a;
/* 10 */            if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
/* 14 */                Bundle bundle = new Bundle();
/* 17 */                bundle.putBinder("android.support.customtabs.extra.SESSION", null);
/* 20 */                intent.putExtras(bundle);
                    }
/* 23 */            ArrayList<? extends Parcelable> arrayList = this.f9434c;
/* 25 */            if (arrayList != null) {
/* 29 */                intent.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
                    }
/* 36 */            intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f9438g);
/* 41 */            this.f9433b.getClass();
/* 49 */            intent.putExtras(new Bundle());
/* 52 */            Bundle bundle2 = this.f9436e;
/* 54 */            if (bundle2 != null) {
/* 56 */                intent.putExtras(bundle2);
                    }
/* 63 */            intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f9437f);
/* 66 */            String strM3867a = g30.m3867a();
/* 74 */            if (!TextUtils.isEmpty(strM3867a)) {
/* 91 */                Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
/* 100 */               if (!bundleExtra.containsKey("Accept-Language")) {
/* 102 */                   bundleExtra.putString("Accept-Language", strM3867a);
/* 105 */                   intent.putExtra("com.android.browser.headers", bundleExtra);
                        }
                    }
/* 112 */           if (Build.VERSION.SDK_INT >= 34) {
/* 116 */               if (this.f9435d == null) {
/* 122 */                   this.f9435d = f30.m3638a();
                        }
/* 127 */               h30.m4099a(this.f9435d, false);
                    }
/* 130 */           ActivityOptions activityOptions = this.f9435d;
/* 140 */           return new j30(intent, activityOptions != null ? activityOptions.toBundle() : null);
                }

                /* JADX INFO: renamed from: b */
                public final void m4452b(int i) {
/* 1 */             if (i < 0 || i > 2) {
/* 32 */                C1951n4.m6859j("Invalid value for the shareState argument");
/* 35 */                return;
                    }
/* 6 */             this.f9437f = i;
/* 8 */             Intent intent = this.f9432a;
/* 13 */            if (i == 1) {
/* 15 */                intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
                    } else if (i == 2) {
/* 22 */                intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
                    } else {
/* 26 */                intent.removeExtra("android.support.customtabs.extra.SHARE_MENU_ITEM");
                    }
                }

/* 58 */        public i30() {
/* 60 */            this.f9432a = new Intent("android.intent.action.VIEW");
/* 63 */            this.f9433b = new dc0(27);
/* 64 */            this.f9437f = 0;
/* 65 */            this.f9438g = true;
                }
            }
