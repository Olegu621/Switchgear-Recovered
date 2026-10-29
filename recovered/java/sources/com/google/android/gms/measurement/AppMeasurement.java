            package com.google.android.gms.measurement;

            import android.content.Context;
            import android.os.Bundle;
            import com.google.android.gms.internal.measurement.zzdd;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Map;
            import p000.af3;
            import p000.ge3;
            import p000.he3;
            import p000.ij3;
            import p000.kb1;
            import p000.tl3;
            import p000.uc3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
/* 10 */    public class AppMeasurement {

                /* JADX INFO: renamed from: b */
                public static volatile AppMeasurement f4185b;

                /* JADX INFO: renamed from: a */
                public final af3 f4186a;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class ConditionalUserProperty {
                    public boolean mActive;
                    public String mAppId;
                    public long mCreationTimestamp;
                    public String mExpiredEventName;
                    public Bundle mExpiredEventParams;
                    public String mName;
                    public String mOrigin;
                    public long mTimeToLive;
                    public String mTimedOutEventName;
                    public Bundle mTimedOutEventParams;
                    public String mTriggerEventName;
                    public long mTriggerTimeout;
                    public String mTriggeredEventName;
                    public Bundle mTriggeredEventParams;
                    public long mTriggeredTimestamp;
                    public Object mValue;
                }

                public AppMeasurement(ij3 ij3Var) {
/* 9 */             this.f4186a = new uc3(ij3Var);
                }

                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Deprecated
                public static AppMeasurement getInstance(Context context) {
/* 3 */             if (f4185b == null) {
                        synchronized (AppMeasurement.class) {
/* 10 */                    if (f4185b == null) {
/* 37 */                        tl3 tl3Var = (tl3) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
/* 44 */                        if (tl3Var != null) {
/* 51 */                            f4185b = new AppMeasurement(tl3Var);
                                } else {
/* 75 */                            f4185b = new AppMeasurement(ij3.m4556r(context, new zzdd(0L, 0L, true, null, null), null));
                                }
                            }
                        }
                    }
/* 81 */            return f4185b;
                }

                public void beginAdUnitExposure(String str) {
/* 3 */             this.f4186a.zzm(str);
                }

                public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
/* 3 */             this.f4186a.zzp(str, str2, bundle);
                }

                public void endAdUnitExposure(String str) {
/* 3 */             this.f4186a.zzn(str);
                }

                public long generateEventId() {
/* 3 */             return this.f4186a.zzl();
                }

                public String getAppInstanceId() {
/* 3 */             return this.f4186a.zzj();
                }

                public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
/* 3 */             List<Bundle> listZzq = this.f4186a.zzq(str, str2);
/* 17 */            ArrayList arrayList = new ArrayList(listZzq == null ? 0 : listZzq.size());
/* 28 */            for (Bundle bundle : listZzq) {
/* 38 */                ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
/* 41 */                kb1.m6061n(bundle);
/* 55 */                conditionalUserProperty.mAppId = (String) he3.m4179A(bundle, "app_id", String.class, null);
/* 65 */                conditionalUserProperty.mOrigin = (String) he3.m4179A(bundle, FirebaseAnalytics.Param.ORIGIN, String.class, null);
/* 75 */                conditionalUserProperty.mName = (String) he3.m4179A(bundle, "name", String.class, null);
/* 85 */                conditionalUserProperty.mValue = he3.m4179A(bundle, FirebaseAnalytics.Param.VALUE, Object.class, null);
/* 95 */                conditionalUserProperty.mTriggerEventName = (String) he3.m4179A(bundle, "trigger_event_name", String.class, null);
/* 117 */               conditionalUserProperty.mTriggerTimeout = ((Long) he3.m4179A(bundle, "trigger_timeout", Long.class, 0L)).longValue();
/* 127 */               conditionalUserProperty.mTimedOutEventName = (String) he3.m4179A(bundle, "timed_out_event_name", String.class, null);
/* 139 */               conditionalUserProperty.mTimedOutEventParams = (Bundle) he3.m4179A(bundle, "timed_out_event_params", Bundle.class, null);
/* 149 */               conditionalUserProperty.mTriggeredEventName = (String) he3.m4179A(bundle, "triggered_event_name", String.class, null);
/* 159 */               conditionalUserProperty.mTriggeredEventParams = (Bundle) he3.m4179A(bundle, "triggered_event_params", Bundle.class, null);
/* 173 */               conditionalUserProperty.mTimeToLive = ((Long) he3.m4179A(bundle, "time_to_live", Long.class, 0L)).longValue();
/* 183 */               conditionalUserProperty.mExpiredEventName = (String) he3.m4179A(bundle, "expired_event_name", String.class, null);
/* 193 */               conditionalUserProperty.mExpiredEventParams = (Bundle) he3.m4179A(bundle, "expired_event_params", Bundle.class, null);
/* 211 */               conditionalUserProperty.mActive = ((Boolean) he3.m4179A(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
/* 225 */               conditionalUserProperty.mCreationTimestamp = ((Long) he3.m4179A(bundle, "creation_timestamp", Long.class, 0L)).longValue();
/* 239 */               conditionalUserProperty.mTriggeredTimestamp = ((Long) he3.m4179A(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
/* 241 */               arrayList.add(conditionalUserProperty);
                    }
/* 246 */           return arrayList;
                }

                public String getCurrentScreenClass() {
/* 3 */             return this.f4186a.zzi();
                }

                public String getCurrentScreenName() {
/* 3 */             return this.f4186a.zzh();
                }

                public String getGmpAppId() {
/* 3 */             return this.f4186a.zzk();
                }

                public int getMaxUserProperties(String str) {
/* 3 */             return this.f4186a.zzr(str);
                }

                public Map<String, Object> getUserProperties(String str, String str2, boolean z) {
/* 3 */             return this.f4186a.zzd(str, str2, z);
                }

                public void logEventInternal(String str, String str2, Bundle bundle) {
/* 3 */             this.f4186a.zza(str, str2, bundle);
                }

                public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
/* 1 */             kb1.m6061n(conditionalUserProperty);
/* 6 */             Bundle bundle = new Bundle();
/* 9 */             String str = conditionalUserProperty.mAppId;
/* 11 */            if (str != null) {
/* 15 */                bundle.putString("app_id", str);
                    }
/* 18 */            String str2 = conditionalUserProperty.mOrigin;
/* 20 */            if (str2 != null) {
/* 24 */                bundle.putString(FirebaseAnalytics.Param.ORIGIN, str2);
                    }
/* 27 */            String str3 = conditionalUserProperty.mName;
/* 29 */            if (str3 != null) {
/* 33 */                bundle.putString("name", str3);
                    }
/* 36 */            Object obj = conditionalUserProperty.mValue;
/* 38 */            if (obj != null) {
/* 40 */                he3.m4203z(bundle, obj);
                    }
/* 43 */            String str4 = conditionalUserProperty.mTriggerEventName;
/* 45 */            if (str4 != null) {
/* 49 */                bundle.putString("trigger_event_name", str4);
                    }
/* 56 */            bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
/* 59 */            String str5 = conditionalUserProperty.mTimedOutEventName;
/* 61 */            if (str5 != null) {
/* 65 */                bundle.putString("timed_out_event_name", str5);
                    }
/* 68 */            Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
/* 70 */            if (bundle2 != null) {
/* 74 */                bundle.putBundle("timed_out_event_params", bundle2);
                    }
/* 77 */            String str6 = conditionalUserProperty.mTriggeredEventName;
/* 79 */            if (str6 != null) {
/* 83 */                bundle.putString("triggered_event_name", str6);
                    }
/* 86 */            Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
/* 88 */            if (bundle3 != null) {
/* 92 */                bundle.putBundle("triggered_event_params", bundle3);
                    }
/* 99 */            bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
/* 102 */           String str7 = conditionalUserProperty.mExpiredEventName;
/* 104 */           if (str7 != null) {
/* 108 */               bundle.putString("expired_event_name", str7);
                    }
/* 111 */           Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
/* 113 */           if (bundle4 != null) {
/* 117 */               bundle.putBundle("expired_event_params", bundle4);
                    }
/* 124 */           bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
/* 131 */           bundle.putBoolean("active", conditionalUserProperty.mActive);
/* 138 */           bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
/* 143 */           this.f4186a.zzo(bundle);
                }

/* 11 */        public AppMeasurement(tl3 tl3Var) {
                    this.f4186a = new ge3(tl3Var);
                }
            }
