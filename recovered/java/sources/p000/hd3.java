            package p000;

            import android.content.Intent;
            import android.os.Bundle;
            import android.os.Looper;
            import android.os.Message;
            import android.os.Messenger;
            import android.os.Parcelable;
            import android.util.Log;
            import com.google.android.gms.cloudmessaging.zzd;
            import com.google.android.gms.internal.cloudmessaging.zzf;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.Objects;
            import java.util.regex.Matcher;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class hd3 extends zzf {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ h52 f9023a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public hd3(h52 h52Var, Looper looper) {
/* 3 */             super(looper);
/* 1 */             this.f9023a = h52Var;
                }

                @Override // android.os.Handler
                public final void handleMessage(Message message) {
/* 1 */             h52 h52Var = this.f9023a;
/* 3 */             if (message != null) {
/* 5 */                 Object obj = message.obj;
/* 9 */                 if (obj instanceof Intent) {
/* 11 */                    Intent intent = (Intent) obj;
/* 18 */                    intent.setExtrasClassLoader(new cf3());
/* 27 */                    if (intent.hasExtra("google.messenger")) {
/* 31 */                        Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
/* 37 */                        if (parcelableExtra instanceof zzd) {
/* 42 */                            h52Var.f8911g = (zzd) parcelableExtra;
                                }
/* 46 */                        if (parcelableExtra instanceof Messenger) {
/* 50 */                            h52Var.f8910f = (Messenger) parcelableExtra;
                                }
                            }
/* 54 */                    Intent intent2 = (Intent) message.obj;
/* 56 */                    String action = intent2.getAction();
/* 67 */                    if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
/* 75 */                        if (Log.isLoggable("Rpc", 3)) {
/* 83 */                            "Unexpected response action: ".concat(String.valueOf(action));
/* 86 */                            return;
                                }
/* 296 */                       return;
                            }
/* 89 */                    String stringExtra = intent2.getStringExtra("registration_id");
/* 93 */                    if (stringExtra == null) {
/* 97 */                        stringExtra = intent2.getStringExtra("unregistered");
                            }
/* 103 */                   if (stringExtra != null) {
/* 250 */                       Matcher matcher = h52.f8904j.matcher(stringExtra);
/* 258 */                       if (!matcher.matches()) {
/* 266 */                           if (Log.isLoggable("Rpc", 3)) {
/* 270 */                               "Unexpected response string: ".concat(stringExtra);
/* 273 */                               return;
                                    }
/* 296 */                           return;
                                }
/* 274 */                       String strGroup = matcher.group(1);
/* 278 */                       String strGroup2 = matcher.group(2);
/* 282 */                       if (strGroup != null) {
/* 284 */                           Bundle extras = intent2.getExtras();
/* 290 */                           extras.putString("registration_id", strGroup2);
/* 293 */                           h52Var.m4117b(strGroup, extras);
/* 296 */                           return;
                                }
/* 296 */                       return;
                            }
/* 107 */                   String stringExtra2 = intent2.getStringExtra("error");
/* 111 */                   if (stringExtra2 == null) {
/* 129 */                       AbstractC1245n0.m4889q("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
/* 132 */                       return;
                            }
/* 139 */                   if (Log.isLoggable("Rpc", 3)) {
/* 143 */                       "Received InstanceID error ".concat(stringExtra2);
                            }
/* 152 */                   if (!stringExtra2.startsWith("|")) {
                                synchronized (h52Var.f8905a) {
/* 219 */                           int i = 0;
                                    while (true) {
                                        try {
/* 220 */                                   le2 le2Var = h52Var.f8905a;
/* 224 */                                   if (i < le2Var.f13213c) {
/* 236 */                                       h52Var.m4117b((String) le2Var.m6428h(i), intent2.getExtras());
/* 239 */                                       i++;
                                            }
                                        } catch (Throwable th) {
/* 247 */                                   throw th;
                                        }
                                    }
                                }
/* 245 */                       return;
                            }
/* 156 */                   String[] strArrSplit = stringExtra2.split("\\|");
/* 161 */                   if (strArrSplit.length <= 2 || !Objects.equals(strArrSplit[1], "ID")) {
/* 212 */                       AbstractC1245n0.m4889q("Rpc", "Unexpected structured response ".concat(stringExtra2));
/* 215 */                       return;
                            }
/* 174 */                   String str = strArrSplit[2];
/* 176 */                   String strSubstring = strArrSplit[3];
/* 184 */                   if (strSubstring.startsWith(":")) {
/* 186 */                       strSubstring = strSubstring.substring(1);
                            }
/* 200 */                   h52Var.m4117b(str, intent2.putExtra("error", strSubstring).getExtras());
/* 203 */                   return;
                        }
                    }
/* 301 */           AbstractC1245n0.m4889q("Rpc", "Dropping invalid message");
                }
            }
