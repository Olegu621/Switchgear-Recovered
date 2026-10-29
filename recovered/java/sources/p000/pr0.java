            package p000;

            import android.R;
            import android.app.Activity;
            import android.app.AlertDialog;
            import android.app.FragmentManager;
            import android.app.Notification;
            import android.app.NotificationChannel;
            import android.app.NotificationManager;
            import android.app.PendingIntent;
            import android.content.Context;
            import android.content.DialogInterface;
            import android.content.res.Resources;
            import android.os.Bundle;
            import android.util.TypedValue;
            import androidx.core.graphics.drawable.IconCompat;
            import androidx.fragment.app.AbstractC0111w;
            import androidx.fragment.app.C0086a;
            import androidx.fragment.app.FragmentActivity;
            import com.google.android.gms.base.R$drawable;
            import com.google.android.gms.base.R$string;
            import com.google.android.gms.common.api.GoogleApiActivity;
            import io.sentry.android.core.AbstractC1245n0;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class pr0 extends qr0 {

                /* JADX INFO: renamed from: c */
                public static final Object f15258c = new Object();

                /* JADX INFO: renamed from: d */
                public static final pr0 f15259d = new pr0();

                /* JADX INFO: renamed from: e */
                public static AlertDialog m7539e(Activity activity, int i, yb3 yb3Var, DialogInterface.OnCancelListener onCancelListener) {
                    String string;
/* 2 */             if (i == 0) {
/* 1 */                 return null;
                    }
/* 7 */             TypedValue typedValue = new TypedValue();
/* 18 */            activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
/* 46 */            AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
/* 47 */            if (builder == null) {
/* 51 */                builder = new AlertDialog.Builder(activity);
                    }
/* 58 */            builder.setMessage(hb3.m4159b(activity, i));
/* 61 */            if (onCancelListener != null) {
/* 63 */                builder.setOnCancelListener(onCancelListener);
                    }
/* 66 */            Resources resources = activity.getResources();
/* 70 */            if (i == 1) {
/* 102 */               string = resources.getString(R$string.common_google_play_services_install_button);
                    } else if (i != 2) {
/* 88 */                string = i != 3 ? resources.getString(R.string.ok) : resources.getString(R$string.common_google_play_services_enable_button);
                    } else {
/* 95 */                string = resources.getString(R$string.common_google_play_services_update_button);
                    }
/* 106 */           if (string != null) {
/* 108 */               if (yb3Var == null) {
/* 110 */                   yb3Var = null;
                        }
/* 111 */               builder.setPositiveButton(string, yb3Var);
                    }
/* 114 */           String strM4160c = hb3.m4160c(activity, i);
/* 118 */           if (strM4160c != null) {
/* 120 */               builder.setTitle(strM4160c);
                    }
/* 136 */           AbstractC1245n0.m4891s("GoogleApiAvailability", fm0.m3781g(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
/* 139 */           return builder.create();
                }

                /* JADX INFO: renamed from: f */
                public static void m7540f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
                    try {
/* 6 */                 if (activity instanceof FragmentActivity) {
/* 10 */                    AbstractC0111w supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
/* 16 */                    vi2 vi2Var = new vi2();
/* 19 */                    kb1.m6062o(alertDialog, "Cannot display null dialog");
/* 22 */                    alertDialog.setOnCancelListener(null);
/* 25 */                    alertDialog.setOnDismissListener(null);
/* 28 */                    vi2Var.f18203b0 = alertDialog;
/* 30 */                    if (onCancelListener != null) {
/* 32 */                        vi2Var.f18204c0 = onCancelListener;
                            }
/* 35 */                    vi2Var.f1449Y = false;
/* 38 */                    vi2Var.f1450Z = true;
/* 40 */                    supportFragmentManager.getClass();
/* 45 */                    C0086a c0086a = new C0086a(supportFragmentManager);
/* 48 */                    c0086a.f1400p = true;
/* 50 */                    c0086a.m639e(0, vi2Var, str, 1);
/* 53 */                    c0086a.m638d(false);
/* 56 */                    return;
                        }
                    } catch (NoClassDefFoundError unused) {
                    }
/* 57 */            FragmentManager fragmentManager = activity.getFragmentManager();
/* 63 */            qe0 qe0Var = new qe0();
/* 66 */            kb1.m6062o(alertDialog, "Cannot display null dialog");
/* 69 */            alertDialog.setOnCancelListener(null);
/* 72 */            alertDialog.setOnDismissListener(null);
/* 75 */            qe0Var.f15500a = alertDialog;
/* 77 */            if (onCancelListener != null) {
/* 79 */                qe0Var.f15501b = onCancelListener;
                    }
/* 81 */            qe0Var.show(fragmentManager, str);
                }

                @Override // p000.qr0
                /* JADX INFO: renamed from: b */
                public final int mo7541b(Context context) {
/* 3 */             return m8004c(context, qr0.f15711a);
                }

                /* JADX INFO: renamed from: d */
                public final void m7542d(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
/* 12 */            AlertDialog alertDialogM7539e = m7539e(googleApiActivity, i, yb3.m10140b(googleApiActivity, super.m8003a(googleApiActivity, "d", i), 2), googleApiActivity2);
/* 16 */            if (alertDialogM7539e == null) {
/* 18 */                return;
                    }
/* 21 */            m7540f(googleApiActivity, alertDialogM7539e, "GooglePlayServicesErrorDialog", googleApiActivity2);
                }

                /* JADX INFO: renamed from: g */
                public final void m7543g(Context context, int i, PendingIntent pendingIntent) {
                    int i2;
                    int i3;
/* 20 */            AbstractC1245n0.m4891s("GoogleApiAvailability", AbstractC0886en.m3505i(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
/* 26 */            if (i == 18) {
/* 38 */                new qb3(this, context).sendEmptyMessageDelayed(1, 120000L);
/* 41 */                return;
                    }
/* 43 */            if (pendingIntent == null) {
/* 45 */                if (i == 6) {
/* 51 */                    AbstractC1245n0.m4889q("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
/* 54 */                    return;
                        }
/* 54 */                return;
                    }
/* 64 */            String strM4162e = i == 6 ? hb3.m4162e(context, "common_google_play_services_resolution_required_title") : hb3.m4160c(context, i);
/* 68 */            if (strM4162e == null) {
/* 76 */                strM4162e = context.getResources().getString(R$string.common_google_play_services_notification_ticker);
                    }
/* 98 */            String strM4161d = (i == 6 || i == 19) ? hb3.m4161d(context, "common_google_play_services_resolution_required_text", hb3.m4158a(context)) : hb3.m4159b(context, i);
/* 102 */           Resources resources = context.getResources();
/* 108 */           Object systemService = context.getSystemService("notification");
/* 112 */           kb1.m6061n(systemService);
/* 116 */           NotificationManager notificationManager = (NotificationManager) systemService;
/* 121 */           po1 po1Var = new po1(context, null);
/* 124 */           po1Var.f15214n = true;
/* 126 */           po1Var.m7526c(true);
/* 133 */           po1Var.f15205e = po1.m7524b(strM4162e);
/* 137 */           jo1 jo1Var = new jo1();
/* 144 */           jo1Var.f12410b = po1.m7524b(strM4161d);
/* 146 */           po1Var.m7530g(jo1Var);
/* 154 */           if (i13.m4441u(context)) {
/* 164 */               po1Var.f15220t.icon = context.getApplicationInfo().icon;
/* 166 */               po1Var.f15210j = 2;
/* 172 */               if (i13.m4442v(context)) {
/* 174 */                   int i4 = R$drawable.common_full_open_on_phone;
/* 216 */                   i2 = 2;
/* 223 */                   po1Var.f15202b.add(new yn1(i4 != 0 ? IconCompat.m586b(i4, HttpUrl.FRAGMENT_ENCODE_SET) : null, (CharSequence) resources.getString(R$string.common_open_on_phone), pendingIntent, new Bundle(), (g32[]) null, true, 0, true, false, false));
                        } else {
/* 229 */                   i2 = 2;
/* 230 */                   po1Var.f15207g = pendingIntent;
                        }
                    } else {
/* 235 */               i2 = 2;
/* 241 */               po1Var.f15220t.icon = R.drawable.stat_sys_warning;
/* 255 */               po1Var.f15220t.tickerText = po1.m7524b(resources.getString(R$string.common_google_play_services_notification_ticker));
/* 263 */               po1Var.f15220t.when = System.currentTimeMillis();
/* 265 */               po1Var.f15207g = pendingIntent;
/* 271 */               po1Var.f15206f = po1.m7524b(strM4161d);
                    }
/* 277 */           if (j13.m5650l()) {
/* 284 */               kb1.m6065r(j13.m5650l());
                        synchronized (f15258c) {
                        }
/* 3 */                 NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
/* 303 */               String string = context.getResources().getString(R$string.common_google_play_services_notification_channel_name);
/* 307 */               if (notificationChannel == null) {
/* 1 */                     notificationManager.createNotificationChannel(p30.m7297c(string));
                        } else if (!string.contentEquals(notificationChannel.getName())) {
/* 1 */                     notificationChannel.setName(string);
/* 1 */                     notificationManager.createNotificationChannel(notificationChannel);
                        }
/* 333 */               po1Var.f15218r = "com.google.android.gms.availability";
                    }
/* 335 */           Notification notificationM7525a = po1Var.m7525a();
/* 340 */           if (i == 1 || i == i2 || i == 3) {
/* 354 */               wr0.f18783a.set(false);
/* 357 */               i3 = 10436;
                    } else {
/* 347 */               i3 = 39789;
                    }
/* 359 */           notificationManager.notify(i3, notificationM7525a);
                }

                /* JADX INFO: renamed from: h */
                public final void m7544h(Activity activity, e71 e71Var, int i, DialogInterface.OnCancelListener onCancelListener) {
/* 12 */            AlertDialog alertDialogM7539e = m7539e(activity, i, yb3.m10141c(e71Var, super.m8003a(activity, "d", i), 2), onCancelListener);
/* 16 */            if (alertDialogM7539e == null) {
/* 18 */                return;
                    }
/* 21 */            m7540f(activity, alertDialogM7539e, "GooglePlayServicesErrorDialog", onCancelListener);
                }
            }
