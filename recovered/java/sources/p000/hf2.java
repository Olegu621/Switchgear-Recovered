            package p000;

            import android.app.Activity;
            import android.app.PendingIntent;
            import android.content.ActivityNotFoundException;
            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import android.content.IntentFilter;
            import android.content.IntentSender;
            import android.content.pm.PackageManager;
            import android.content.pm.Signature;
            import android.net.Uri;
            import android.os.Build;
            import android.os.Bundle;
            import com.google.android.gms.auth.api.credentials.Credential;
            import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
            import com.google.android.gms.auth.api.credentials.CredentialRequest;
            import com.google.android.gms.auth.api.credentials.HintRequest;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.internal.p014authapi.zbn;
            import com.google.android.gms.internal.p015authapiphone.zzab;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
            import fman.p010ge.smart_auth.SmartAuthPlugin$ConsentBroadcastReceiver;
            import fman.p010ge.smart_auth.SmartAuthPlugin$SmsBroadcastReceiver;
            import io.flutter.embedding.engine.plugins.FlutterPlugin;
            import io.flutter.embedding.engine.plugins.activity.ActivityAware;
            import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
            import io.flutter.plugin.common.MethodCall;
            import io.flutter.plugin.common.MethodChannel;
            import io.flutter.plugin.common.PluginRegistry;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.Intrinsics;
            import p000.hf2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class hf2 implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware, PluginRegistry.ActivityResultListener {

                /* JADX INFO: renamed from: a */
                public Context f9056a;

                /* JADX INFO: renamed from: b */
                public Activity f9057b;

                /* JADX INFO: renamed from: c */
                public ActivityPluginBinding f9058c;

                /* JADX INFO: renamed from: d */
                public MethodChannel f9059d;

                /* JADX INFO: renamed from: e */
                public MethodChannel.Result f9060e;

                /* JADX INFO: renamed from: f */
                public SmartAuthPlugin$SmsBroadcastReceiver f9061f;

                /* JADX INFO: renamed from: i */
                public SmartAuthPlugin$ConsentBroadcastReceiver f9062i;

                /* JADX INFO: renamed from: a */
                public static HashMap m4206a(Credential credential) {
/* 3 */             HashMap map = new HashMap();
/* 10 */            map.put("accountType", credential.f3281f);
/* 17 */            map.put("familyName", credential.f3283v);
/* 24 */            map.put("givenName", credential.f3282i);
/* 31 */            map.put("id", credential.f3276a);
/* 38 */            map.put("name", credential.f3277b);
/* 45 */            map.put(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, credential.f3280e);
/* 56 */            map.put("profilePictureUri", String.valueOf(credential.f3278c));
/* 59 */            return map;
                }

                /* JADX INFO: renamed from: c */
                public static Credential m4207c(MethodCall methodCall, MethodChannel.Result result) {
/* 7 */             String str = (String) methodCall.argument("accountType");
/* 16 */            String str2 = (String) methodCall.argument("id");
/* 24 */            String str3 = (String) methodCall.argument("name");
/* 32 */            String str4 = (String) methodCall.argument(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD);
/* 40 */            String str5 = (String) methodCall.argument("profilePictureUri");
/* 43 */            if (str2 == null) {
/* 47 */                result.success(Boolean.FALSE);
/* 42 */                return null;
                    }
/* 55 */            String str6 = str != null ? str : null;
/* 56 */            if (str3 == null) {
/* 59 */                str3 = null;
                    }
/* 78 */            return new Credential(str2, str3, str5 != null ? Uri.parse(str5) : null, null, str4 != null ? str4 : null, str6, null, null);
                }

                /* JADX INFO: renamed from: b */
                public final void m4208b() {
/* 1 */             SmartAuthPlugin$SmsBroadcastReceiver smartAuthPlugin$SmsBroadcastReceiver = this.f9061f;
/* 4 */             if (smartAuthPlugin$SmsBroadcastReceiver != null) {
/* 6 */                 m4209d(smartAuthPlugin$SmsBroadcastReceiver);
/* 9 */                 this.f9061f = null;
                    }
/* 11 */            SmartAuthPlugin$ConsentBroadcastReceiver smartAuthPlugin$ConsentBroadcastReceiver = this.f9062i;
/* 13 */            if (smartAuthPlugin$ConsentBroadcastReceiver != null) {
/* 15 */                m4209d(smartAuthPlugin$ConsentBroadcastReceiver);
/* 18 */                this.f9062i = null;
                    }
                    try {
/* 20 */                MethodChannel.Result result = this.f9060e;
/* 22 */                if (result != null) {
/* 24 */                    result.success(null);
                        }
                    } catch (IllegalStateException e) {
/* 45 */                AbstractC1245n0.m4876d("Pinput/SmartAuth", "ignoring exception: " + e);
                    }
/* 48 */            this.f9057b = null;
/* 50 */            ActivityPluginBinding activityPluginBinding = this.f9058c;
/* 52 */            if (activityPluginBinding != null) {
/* 54 */                activityPluginBinding.removeActivityResultListener(this);
                    }
/* 57 */            this.f9058c = null;
                }

                /* JADX INFO: renamed from: d */
                public final void m4209d(BroadcastReceiver broadcastReceiver) {
/* 1 */             if (broadcastReceiver != null) {
                        try {
/* 3 */                     Context context = this.f9056a;
/* 5 */                     if (context != null) {
/* 7 */                         context.unregisterReceiver(broadcastReceiver);
                            } else {
/* 13 */                        Intrinsics.m6220e("mContext");
/* 17 */                        throw null;
                            }
                        } catch (Exception e) {
/* 23 */                    AbstractC1245n0.m4877e("Pinput/SmartAuth", "Unregistering receiver failed.", e);
                        }
                    }
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener, com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.ActivityResultListener
                public final boolean onActivityResult(int i, int i2, Intent intent) {
                    Credential credential;
                    Credential credential2;
                    switch (i) {
                        case 11100:
/* 182 */                   if (i2 == -1 && intent != null && (credential = (Credential) intent.getParcelableExtra("com.google.android.gms.credentials.Credential")) != null) {
                                try {
/* 194 */                           MethodChannel.Result result = this.f9060e;
/* 196 */                           if (result != null) {
/* 202 */                               result.success(m4206a(credential));
                                    }
                                } catch (IllegalStateException e) {
/* 219 */                           AbstractC1245n0.m4876d("Pinput/SmartAuth", "ignoring exception: " + e);
                                }
                                break;
                            } else {
                                try {
/* 223 */                           MethodChannel.Result result2 = this.f9060e;
/* 225 */                           if (result2 != null) {
/* 227 */                               result2.success(null);
                                    }
                                } catch (IllegalStateException e2) {
/* 244 */                           AbstractC1245n0.m4876d("Pinput/SmartAuth", "ignoring exception: " + e2);
                                }
                                break;
                            }
/* 1 */                     return true;
                        case 11101:
/* 121 */                   if (i2 == -1 && intent != null) {
/* 127 */                       String stringExtra = intent.getStringExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                                try {
/* 131 */                           MethodChannel.Result result3 = this.f9060e;
/* 133 */                           if (result3 != null) {
/* 135 */                               result3.success(stringExtra);
                                    }
                                } catch (IllegalStateException e3) {
/* 153 */                           AbstractC1245n0.m4876d("Pinput/SmartAuth", "ignoring exception: " + e3);
                                }
                                break;
                            } else {
                                try {
/* 157 */                           MethodChannel.Result result4 = this.f9060e;
/* 159 */                           if (result4 != null) {
/* 161 */                               result4.success(null);
                                    }
                                } catch (IllegalStateException e4) {
/* 178 */                           AbstractC1245n0.m4876d("Pinput/SmartAuth", "ignoring exception: " + e4);
                                }
                                break;
                            }
/* 1 */                     return true;
                        case 11102:
                            try {
/* 85 */                        MethodChannel.Result result5 = this.f9060e;
/* 87 */                        if (result5 != null) {
/* 98 */                            result5.success(Boolean.valueOf(i2 == -1));
                                }
                                break;
                            } catch (IllegalStateException e5) {
/* 116 */                       AbstractC1245n0.m4876d("Pinput/SmartAuth", "ignoring exception: " + e5);
                            }
/* 1 */                     return true;
                        case 11103:
/* 15 */                    if (i2 == -1 && intent != null && (credential2 = (Credential) intent.getParcelableExtra("com.google.android.gms.credentials.Credential")) != null) {
                                try {
/* 27 */                            MethodChannel.Result result6 = this.f9060e;
/* 29 */                            if (result6 != null) {
/* 35 */                                result6.success(m4206a(credential2));
                                    }
                                } catch (IllegalStateException e6) {
/* 53 */                            AbstractC1245n0.m4876d("Pinput/SmartAuth", "ignoring exception: " + e6);
                                }
                                break;
                            } else {
                                try {
/* 58 */                            MethodChannel.Result result7 = this.f9060e;
/* 60 */                            if (result7 != null) {
/* 62 */                                result7.success(null);
                                    }
                                } catch (IllegalStateException e7) {
/* 80 */                            AbstractC1245n0.m4876d("Pinput/SmartAuth", "ignoring exception: " + e7);
                                }
                                break;
                            }
/* 1 */                     return true;
                        default:
/* 1 */                     return true;
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public final void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
/* 1 */             activityPluginBinding.getClass();
/* 8 */             this.f9057b = activityPluginBinding.getActivity();
/* 10 */            this.f9058c = activityPluginBinding;
/* 12 */            activityPluginBinding.addActivityResultListener(this);
                }

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
                public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
/* 1 */             flutterPluginBinding.getClass();
/* 15 */            this.f9059d = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "fman.smart_auth");
/* 21 */            this.f9056a = flutterPluginBinding.getApplicationContext();
/* 23 */            MethodChannel methodChannel = this.f9059d;
/* 25 */            if (methodChannel != null) {
/* 27 */                methodChannel.setMethodCallHandler(this);
                    }
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public final void onDetachedFromActivity() {
/* 1 */             m4208b();
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public final void onDetachedFromActivityForConfigChanges() {
/* 1 */             m4208b();
                }

                @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
                public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
/* 1 */             flutterPluginBinding.getClass();
/* 4 */             m4208b();
/* 7 */             MethodChannel methodChannel = this.f9059d;
/* 10 */            if (methodChannel != null) {
/* 12 */                methodChannel.setMethodCallHandler(null);
                    }
/* 15 */            this.f9059d = null;
                }

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v13, types: [android.content.BroadcastReceiver, fman.ge.smart_auth.SmartAuthPlugin$SmsBroadcastReceiver] */
                /* JADX WARN: Type inference failed for: r2v1, types: [android.content.BroadcastReceiver, fman.ge.smart_auth.SmartAuthPlugin$ConsentBroadcastReceiver] */
                @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
                public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) throws IntentSender.SendIntentException {
                    Signature[] apkContentsSigners;
/* 7 */             methodCall.getClass();
/* 10 */            result.getClass();
/* 13 */            String str = methodCall.method;
/* 15 */            if (str != null) {
/* 35 */                int i = 1;
                        switch (str.hashCode()) {
                            case -1067412648:
/* 953 */                       if (str.equals("stopSmsUserConsent")) {
/* 956 */                           SmartAuthPlugin$ConsentBroadcastReceiver smartAuthPlugin$ConsentBroadcastReceiver = this.f9062i;
/* 958 */                           if (smartAuthPlugin$ConsentBroadcastReceiver == null) {
/* 962 */                               result.success(Boolean.FALSE);
/* 965 */                               return;
                                    }
/* 966 */                           if (smartAuthPlugin$ConsentBroadcastReceiver != null) {
/* 968 */                               m4209d(smartAuthPlugin$ConsentBroadcastReceiver);
/* 971 */                               this.f9062i = null;
                                    }
/* 975 */                           result.success(Boolean.TRUE);
/* 978 */                           return;
                                }
                                break;
                            case -981163955:
/* 765 */                       if (str.equals("getCredential")) {
/* 775 */                           String str2 = (String) methodCall.argument("accountType");
/* 781 */                           String str3 = (String) methodCall.argument("serverClientId");
/* 787 */                           String str4 = (String) methodCall.argument("idTokenNonce");
/* 793 */                           Boolean bool = (Boolean) methodCall.argument("isIdTokenRequested");
/* 801 */                           Boolean bool2 = (Boolean) methodCall.argument("isPasswordLoginSupported");
/* 809 */                           Boolean bool3 = (Boolean) methodCall.argument("showResolveDialog");
/* 818 */                           boolean zBooleanValue = bool3 != null ? bool3.booleanValue() : false;
/* 819 */                           String[] strArr = {str2};
/* 823 */                           if (str2 != null) {
/* 825 */                               strArr = new String[]{str2};
                                    }
/* 834 */                           String str5 = str4 != null ? str4 : null;
/* 845 */                           boolean zBooleanValue2 = bool != null ? bool.booleanValue() : false;
/* 849 */                           boolean zBooleanValue3 = bool2 != null ? bool2.booleanValue() : false;
/* 860 */                           String str6 = str3 != null ? str3 : null;
/* 862 */                           Context context = this.f9056a;
/* 864 */                           if (context == null) {
/* 943 */                               Intrinsics.m6220e("mContext");
/* 946 */                               throw null;
                                    }
/* 866 */                           fc3 fc3VarM4331Z = hu0.m4331Z(context);
/* 870 */                           if (!zBooleanValue3 && strArr.length == 0) {
/* 876 */                               f42.m3656l("At least one authentication method must be specified");
/* 879 */                               return;
                                    }
/* 903 */                           sr1 sr1VarRequest = AbstractC0213ce.f2860c.request(fc3VarM4331Z.asGoogleApiClient(), new CredentialRequest(4, zBooleanValue3, strArr, null, null, zBooleanValue2, str6, str5, false));
/* 914 */                           ac3 ac3Var = new ac3(new n20(), i);
/* 919 */                           TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
/* 927 */                           sr1VarRequest.addStatusListener(new hc3(sr1VarRequest, taskCompletionSource, ac3Var));
/* 939 */                           taskCompletionSource.getTask().addOnCompleteListener(new ch0(result, this, zBooleanValue));
/* 942 */                           return;
                                }
                                break;
                            case -133945416:
/* 687 */                       if (str.equals("startSmsUserConsent")) {
/* 691 */                           SmartAuthPlugin$SmsBroadcastReceiver smartAuthPlugin$SmsBroadcastReceiver = this.f9061f;
/* 693 */                           if (smartAuthPlugin$SmsBroadcastReceiver != null) {
/* 695 */                               m4209d(smartAuthPlugin$SmsBroadcastReceiver);
/* 698 */                               this.f9061f = null;
                                    }
/* 700 */                           SmartAuthPlugin$ConsentBroadcastReceiver smartAuthPlugin$ConsentBroadcastReceiver2 = this.f9062i;
/* 702 */                           if (smartAuthPlugin$ConsentBroadcastReceiver2 != null) {
/* 704 */                               m4209d(smartAuthPlugin$ConsentBroadcastReceiver2);
/* 707 */                               this.f9062i = null;
                                    }
/* 709 */                           this.f9060e = result;
/* 713 */                           ?? r2 = new BroadcastReceiver() { // from class: fman.ge.smart_auth.SmartAuthPlugin$ConsentBroadcastReceiver
                                        @Override // android.content.BroadcastReceiver
                                        public final void onReceive(Context context2, Intent intent) {
                                            Activity activity;
/* 1 */                                     context2.getClass();
/* 4 */                                     intent.getClass();
/* 17 */                                    if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
/* 19 */                                        hf2 hf2Var = this.f8284a;
/* 21 */                                        SmartAuthPlugin$ConsentBroadcastReceiver smartAuthPlugin$ConsentBroadcastReceiver3 = hf2Var.f9062i;
/* 24 */                                        if (smartAuthPlugin$ConsentBroadcastReceiver3 != null) {
/* 26 */                                            hf2Var.m4209d(smartAuthPlugin$ConsentBroadcastReceiver3);
/* 29 */                                            hf2Var.f9062i = null;
                                                }
/* 39 */                                        if (intent.getExtras() != null) {
/* 41 */                                            Bundle extras = intent.getExtras();
/* 45 */                                            extras.getClass();
/* 54 */                                            if (extras.containsKey("com.google.android.gms.auth.api.phone.EXTRA_STATUS")) {
/* 56 */                                                Bundle extras2 = intent.getExtras();
/* 60 */                                                extras2.getClass();
/* 63 */                                                Object obj = extras2.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
/* 67 */                                                obj.getClass();
/* 72 */                                                int i2 = ((Status) obj).f3445a;
/* 74 */                                                if (i2 != 0) {
/* 78 */                                                    if (i2 == 15) {
/* 124 */                                                       AbstractC1245n0.m4876d("Pinput/SmartAuth", "ConsentBroadcastReceiver Timeout");
                                                                try {
/* 127 */                                                           MethodChannel.Result result2 = hf2Var.f9060e;
/* 129 */                                                           if (result2 != null) {
/* 131 */                                                               result2.success(null);
/* 134 */                                                               return;
                                                                    }
/* 275 */                                                           return;
                                                                } catch (IllegalStateException e) {
/* 148 */                                                           AbstractC1245n0.m4876d("Pinput/SmartAuth", "ignoring exception: " + e);
/* 151 */                                                           return;
                                                                }
                                                            }
/* 94 */                                                    AbstractC1245n0.m4876d("Pinput/SmartAuth", "ConsentBroadcastReceiver failed with status code: " + i2);
                                                            try {
/* 97 */                                                        MethodChannel.Result result3 = hf2Var.f9060e;
/* 99 */                                                        if (result3 != null) {
/* 101 */                                                           result3.success(null);
/* 104 */                                                           return;
                                                                }
/* 275 */                                                       return;
                                                            } catch (IllegalStateException e2) {
/* 118 */                                                       AbstractC1245n0.m4876d("Pinput/SmartAuth", "ignoring exception: " + e2);
/* 121 */                                                       return;
                                                            }
                                                        }
                                                        try {
/* 158 */                                                   Intent intent2 = (Intent) extras2.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT");
/* 160 */                                                   if (intent2 != null && (activity = hf2Var.f9057b) != null) {
/* 168 */                                                       activity.startActivityForResult(intent2, 11101);
/* 171 */                                                       return;
                                                            }
/* 176 */                                                   AbstractC1245n0.m4876d("Pinput/SmartAuth", "ConsentBroadcastReceiver error: Can't start consent intent. consentIntent or mActivity is null");
                                                            try {
/* 179 */                                                       MethodChannel.Result result4 = hf2Var.f9060e;
/* 181 */                                                       if (result4 != null) {
/* 183 */                                                           result4.success(null);
/* 186 */                                                           return;
                                                                }
/* 275 */                                                       return;
                                                            } catch (IllegalStateException e3) {
/* 200 */                                                       AbstractC1245n0.m4876d("Pinput/SmartAuth", "ignoring exception: " + e3);
/* 275 */                                                       return;
                                                            }
                                                        } catch (ActivityNotFoundException e4) {
/* 218 */                                                   AbstractC1245n0.m4876d("Pinput/SmartAuth", "ConsentBroadcastReceiver error: " + e4);
                                                            try {
/* 221 */                                                       MethodChannel.Result result5 = hf2Var.f9060e;
/* 223 */                                                       if (result5 != null) {
/* 225 */                                                           result5.success(null);
/* 275 */                                                           return;
                                                                }
/* 275 */                                                       return;
                                                            } catch (IllegalStateException e5) {
/* 242 */                                                       AbstractC1245n0.m4876d("Pinput/SmartAuth", "ignoring exception: " + e5);
/* 275 */                                                       return;
                                                            }
                                                        }
                                                    }
                                                }
/* 248 */                                       AbstractC1245n0.m4876d("Pinput/SmartAuth", "ConsentBroadcastReceiver failed with no status code");
                                                try {
/* 251 */                                           MethodChannel.Result result6 = hf2Var.f9060e;
/* 253 */                                           if (result6 != null) {
/* 255 */                                               result6.success(null);
                                                    }
                                                } catch (IllegalStateException e6) {
/* 272 */                                           AbstractC1245n0.m4876d("Pinput/SmartAuth", "ignoring exception: " + e6);
                                                }
                                            }
                                        }
                                    };
/* 716 */                           this.f9062i = r2;
/* 718 */                           Context context2 = this.f9056a;
/* 720 */                           if (context2 == 0) {
/* 755 */                               Intrinsics.m6220e("mContext");
/* 758 */                               throw null;
                                    }
/* 727 */                           context2.registerReceiver(r2, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"), "com.google.android.gms.auth.api.phone.permission.SEND", null);
/* 730 */                           Context context3 = this.f9056a;
/* 732 */                           if (context3 != null) {
/* 747 */                               new zzab(context3).startSmsUserConsent((String) methodCall.argument("senderPhoneNumber"));
/* 750 */                               return;
                                    } else {
/* 751 */                               Intrinsics.m6220e("mContext");
/* 754 */                               throw null;
                                    }
                                }
                                break;
                            case 37270495:
/* 617 */                       if (str.equals("startSmsRetriever")) {
/* 621 */                           SmartAuthPlugin$SmsBroadcastReceiver smartAuthPlugin$SmsBroadcastReceiver2 = this.f9061f;
/* 623 */                           if (smartAuthPlugin$SmsBroadcastReceiver2 != null) {
/* 625 */                               m4209d(smartAuthPlugin$SmsBroadcastReceiver2);
/* 628 */                               this.f9061f = null;
                                    }
/* 630 */                           SmartAuthPlugin$ConsentBroadcastReceiver smartAuthPlugin$ConsentBroadcastReceiver3 = this.f9062i;
/* 632 */                           if (smartAuthPlugin$ConsentBroadcastReceiver3 != null) {
/* 634 */                               m4209d(smartAuthPlugin$ConsentBroadcastReceiver3);
/* 637 */                               this.f9062i = null;
                                    }
/* 639 */                           this.f9060e = result;
/* 643 */                           ?? r1 = new BroadcastReceiver() { // from class: fman.ge.smart_auth.SmartAuthPlugin$SmsBroadcastReceiver
                                        @Override // android.content.BroadcastReceiver
                                        public final void onReceive(Context context4, Intent intent) {
/* 1 */                                     context4.getClass();
/* 4 */                                     intent.getClass();
/* 17 */                                    if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
/* 19 */                                        hf2 hf2Var = this.f8285a;
/* 21 */                                        SmartAuthPlugin$SmsBroadcastReceiver smartAuthPlugin$SmsBroadcastReceiver3 = hf2Var.f9061f;
/* 24 */                                        if (smartAuthPlugin$SmsBroadcastReceiver3 != null) {
/* 26 */                                            hf2Var.m4209d(smartAuthPlugin$SmsBroadcastReceiver3);
/* 29 */                                            hf2Var.f9061f = null;
                                                }
/* 39 */                                        if (intent.getExtras() != null) {
/* 41 */                                            Bundle extras = intent.getExtras();
/* 45 */                                            extras.getClass();
/* 54 */                                            if (extras.containsKey("com.google.android.gms.auth.api.phone.EXTRA_STATUS")) {
/* 56 */                                                Bundle extras2 = intent.getExtras();
/* 60 */                                                extras2.getClass();
/* 63 */                                                Object obj = extras2.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
/* 67 */                                                obj.getClass();
/* 72 */                                                int i2 = ((Status) obj).f3445a;
/* 74 */                                                if (i2 == 0) {
/* 159 */                                                   String string = extras2.getString("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
/* 163 */                                                   if (string != null) {
                                                                try {
/* 165 */                                                           MethodChannel.Result result2 = hf2Var.f9060e;
/* 167 */                                                           if (result2 != null) {
/* 169 */                                                               result2.success(string);
/* 172 */                                                               return;
                                                                    }
/* 249 */                                                           return;
                                                                } catch (IllegalStateException e) {
/* 186 */                                                           AbstractC1245n0.m4876d("Pinput/SmartAuth", "ignoring exception: " + e);
/* 189 */                                                           return;
                                                                }
                                                            }
/* 192 */                                                   AbstractC1245n0.m4876d("Pinput/SmartAuth", "Retrieved SMS is null, check if SMS contains correct app signature");
                                                            try {
/* 195 */                                                       MethodChannel.Result result3 = hf2Var.f9060e;
/* 197 */                                                       if (result3 != null) {
/* 199 */                                                           result3.success(null);
/* 202 */                                                           return;
                                                                }
/* 249 */                                                       return;
                                                            } catch (IllegalStateException e2) {
/* 216 */                                                       AbstractC1245n0.m4876d("Pinput/SmartAuth", "ignoring exception: " + e2);
/* 219 */                                                       return;
                                                            }
                                                        }
/* 78 */                                                if (i2 == 15) {
/* 129 */                                                   AbstractC1245n0.m4876d("Pinput/SmartAuth", "SMS Retriever API timed out, check if SMS contains correct app signature");
                                                            try {
/* 132 */                                                       MethodChannel.Result result4 = hf2Var.f9060e;
/* 134 */                                                       if (result4 != null) {
/* 136 */                                                           result4.success(null);
/* 139 */                                                           return;
                                                                }
/* 249 */                                                       return;
                                                            } catch (IllegalStateException e3) {
/* 153 */                                                       AbstractC1245n0.m4876d("Pinput/SmartAuth", "ignoring exception: " + e3);
/* 156 */                                                       return;
                                                            }
                                                        }
/* 99 */                                                AbstractC1245n0.m4876d("Pinput/SmartAuth", "SMS Retriever API failed with status code: " + i2 + ", check if SMS contains correct app signature");
                                                        try {
/* 102 */                                                   MethodChannel.Result result5 = hf2Var.f9060e;
/* 104 */                                                   if (result5 != null) {
/* 106 */                                                       result5.success(null);
/* 109 */                                                       return;
                                                            }
/* 249 */                                                   return;
                                                        } catch (IllegalStateException e4) {
/* 123 */                                                   AbstractC1245n0.m4876d("Pinput/SmartAuth", "ignoring exception: " + e4);
/* 126 */                                                   return;
                                                        }
                                                    }
                                                }
/* 222 */                                       AbstractC1245n0.m4876d("Pinput/SmartAuth", "SMS Retriever API failed with no status code, check if SMS contains correct app signature");
                                                try {
/* 225 */                                           MethodChannel.Result result6 = hf2Var.f9060e;
/* 227 */                                           if (result6 != null) {
/* 229 */                                               result6.success(null);
                                                    }
                                                } catch (IllegalStateException e5) {
/* 246 */                                           AbstractC1245n0.m4876d("Pinput/SmartAuth", "ignoring exception: " + e5);
                                                }
                                            }
                                        }
                                    };
/* 646 */                           this.f9061f = r1;
/* 648 */                           Context context4 = this.f9056a;
/* 650 */                           if (context4 == 0) {
/* 677 */                               Intrinsics.m6220e("mContext");
/* 680 */                               throw null;
                                    }
/* 657 */                           context4.registerReceiver(r1, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"), "com.google.android.gms.auth.api.phone.permission.SEND", null);
/* 660 */                           Context context5 = this.f9056a;
/* 662 */                           if (context5 != null) {
/* 669 */                               new zzab(context5).startSmsRetriever();
/* 672 */                               return;
                                    } else {
/* 673 */                               Intrinsics.m6220e("mContext");
/* 676 */                               throw null;
                                    }
                                }
                                break;
                            case 115451405:
/* 471 */                       if (str.equals("getAppSignature")) {
/* 477 */                           Context context6 = this.f9056a;
/* 479 */                           if (context6 == null) {
/* 607 */                               Intrinsics.m6220e("mContext");
/* 610 */                               throw null;
                                    }
/* 481 */                           C1826kc c1826kc = new C1826kc(context6);
/* 486 */                           ArrayList arrayList = new ArrayList();
                                    try {
/* 489 */                               String packageName = c1826kc.getPackageName();
/* 493 */                               PackageManager packageManager = c1826kc.getPackageManager();
/* 501 */                               if (Build.VERSION.SDK_INT >= 28) {
/* 1 */                                     apkContentsSigners = packageManager.getPackageInfo(packageName, 134217728).signingInfo.getApkContentsSigners();
/* 517 */                                   apkContentsSigners.getClass();
                                        } else {
/* 529 */                                   apkContentsSigners = packageManager.getPackageInfo(packageName, 64).signatures;
/* 531 */                                   apkContentsSigners.getClass();
                                        }
/* 536 */                               ArrayList arrayList2 = new ArrayList();
/* 541 */                               for (Signature signature : apkContentsSigners) {
/* 545 */                                   packageName.getClass();
/* 548 */                                   String charsString = signature.toCharsString();
/* 552 */                                   charsString.getClass();
/* 555 */                                   String strM6076a = C1826kc.m6076a(packageName, charsString);
/* 559 */                                   if (strM6076a != null) {
/* 561 */                                       arrayList2.add(strM6076a);
                                            }
                                        }
/* 567 */                               Iterator it = arrayList2.iterator();
/* 575 */                               while (it.hasNext()) {
/* 583 */                                   arrayList.add((String) it.next());
                                            break;
                                        }
                                    } catch (PackageManager.NameNotFoundException e) {
/* 591 */                               AbstractC1245n0.m4877e("kc", "Unable to find package to obtain hash.", e);
/* 596 */                               arrayList = new ArrayList();
                                    }
/* 603 */                           result.success(CollectionsKt.m6201v(0, arrayList));
/* 606 */                           return;
                                }
                                break;
                            case 805013375:
/* 438 */                       if (str.equals("stopSmsRetriever")) {
/* 442 */                           SmartAuthPlugin$SmsBroadcastReceiver smartAuthPlugin$SmsBroadcastReceiver3 = this.f9061f;
/* 444 */                           if (smartAuthPlugin$SmsBroadcastReceiver3 == null) {
/* 448 */                               result.success(Boolean.FALSE);
/* 451 */                               return;
                                    }
/* 452 */                           if (smartAuthPlugin$SmsBroadcastReceiver3 != null) {
/* 454 */                               m4209d(smartAuthPlugin$SmsBroadcastReceiver3);
/* 457 */                               this.f9061f = null;
                                    }
/* 461 */                           result.success(Boolean.TRUE);
/* 464 */                           return;
                                }
                                break;
                            case 1149724086:
/* 195 */                       if (str.equals("requestHint")) {
/* 199 */                           this.f9060e = result;
/* 207 */                           Boolean bool4 = (Boolean) methodCall.argument("showAddAccountButton");
/* 215 */                           Boolean bool5 = (Boolean) methodCall.argument("showCancelButton");
/* 223 */                           Boolean bool6 = (Boolean) methodCall.argument("isPhoneNumberIdentifierSupported");
/* 231 */                           Boolean bool7 = (Boolean) methodCall.argument("isEmailAddressIdentifierSupported");
/* 239 */                           String str7 = (String) methodCall.argument("accountTypes");
/* 245 */                           String str8 = (String) methodCall.argument("idTokenNonce");
/* 251 */                           Boolean bool8 = (Boolean) methodCall.argument("isIdTokenRequested");
/* 257 */                           String str9 = (String) methodCall.argument("serverClientId");
/* 289 */                           CredentialPickerConfig credentialPickerConfig = new CredentialPickerConfig(2, 1, bool4 != null ? bool4.booleanValue() : false, bool5 != null ? bool5.booleanValue() : true, false);
/* 301 */                           boolean zBooleanValue4 = bool6 != null ? bool6.booleanValue() : false;
/* 312 */                           boolean zBooleanValue5 = bool7 != null ? bool7.booleanValue() : false;
/* 321 */                           String[] strArr2 = str7 != null ? new String[]{str7} : null;
/* 327 */                           String str10 = str8 != null ? str8 : null;
/* 338 */                           boolean zBooleanValue6 = bool8 != null ? bool8.booleanValue() : false;
/* 345 */                           String str11 = str9 != null ? str9 : null;
/* 347 */                           Context context7 = this.f9056a;
/* 349 */                           if (context7 == null) {
/* 428 */                               Intrinsics.m6220e("mContext");
/* 431 */                               throw null;
                                    }
/* 351 */                           fc3 fc3VarM4331Z2 = hu0.m4331Z(context7);
/* 355 */                           if (strArr2 == null) {
/* 357 */                               strArr2 = new String[0];
                                    }
/* 359 */                           if (!zBooleanValue5 && !zBooleanValue4 && strArr2.length == 0) {
/* 367 */                               f42.m3656l("At least one authentication method must be specified");
/* 370 */                               return;
                                    }
/* 402 */                           PendingIntent pendingIntentZba = zbn.zba(fc3VarM4331Z2.getApplicationContext(), (C0177be) fc3VarM4331Z2.getApiOptions(), new HintRequest(2, credentialPickerConfig, zBooleanValue5, zBooleanValue4, strArr2, zBooleanValue6, str11, str10), ((C0177be) fc3VarM4331Z2.getApiOptions()).f2383b);
/* 406 */                           pendingIntentZba.getClass();
/* 409 */                           Activity activity = this.f9057b;
/* 411 */                           if (activity != null) {
/* 424 */                               activity.startIntentSenderForResult(pendingIntentZba.getIntentSender(), 11100, null, 0, 0, 0, null);
/* 427 */                               return;
                                    }
/* 427 */                           return;
                                }
                                break;
                            case 1853459892:
/* 122 */                       if (str.equals("saveCredential")) {
/* 126 */                           Credential credentialM4207c = m4207c(methodCall, result);
/* 130 */                           if (credentialM4207c == null) {
/* 427 */                               return;
                                    }
/* 134 */                           Context context8 = this.f9056a;
/* 136 */                           if (context8 == null) {
/* 185 */                               Intrinsics.m6220e("mContext");
/* 188 */                               throw null;
                                    }
/* 148 */                           sr1 sr1VarSave = AbstractC0213ce.f2860c.save(hu0.m4331Z(context8).asGoogleApiClient(), credentialM4207c);
/* 154 */                           p62 p62Var = new p62(11);
/* 159 */                           TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
/* 167 */                           sr1VarSave.addStatusListener(new hc3(sr1VarSave, taskCompletionSource2, p62Var));
/* 181 */                           taskCompletionSource2.getTask().addOnCompleteListener(new C2076pn(15, result, this));
/* 184 */                           return;
                                }
                                break;
                            case 2090692706:
/* 51 */                        if (str.equals("deleteCredential")) {
/* 55 */                            Credential credentialM4207c2 = m4207c(methodCall, result);
/* 59 */                            if (credentialM4207c2 == null) {
/* 427 */                               return;
                                    }
/* 63 */                            Context context9 = this.f9056a;
/* 65 */                            if (context9 == null) {
/* 112 */                               Intrinsics.m6220e("mContext");
/* 115 */                               throw null;
                                    }
/* 77 */                            sr1 sr1VarDelete = AbstractC0213ce.f2860c.delete(hu0.m4331Z(context9).asGoogleApiClient(), credentialM4207c2);
/* 83 */                            p62 p62Var2 = new p62(11);
/* 88 */                            TaskCompletionSource taskCompletionSource3 = new TaskCompletionSource();
/* 96 */                            sr1VarDelete.addStatusListener(new hc3(sr1VarDelete, taskCompletionSource3, p62Var2));
/* 108 */                           taskCompletionSource3.getTask().addOnCompleteListener(new si1(result));
/* 111 */                           return;
                                }
                                break;
                        }
                    }
/* 979 */           result.notImplemented();
                }

                @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
                public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
/* 1 */             activityPluginBinding.getClass();
/* 8 */             this.f9057b = activityPluginBinding.getActivity();
/* 10 */            this.f9058c = activityPluginBinding;
/* 12 */            activityPluginBinding.addActivityResultListener(this);
                }
            }
