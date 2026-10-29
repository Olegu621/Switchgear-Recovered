            package com.google.firebase.analytics.connector;

            import android.content.Context;
            import android.os.Bundle;
            import com.google.android.gms.internal.measurement.zzfb;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.google.firebase.analytics.connector.internal.zzc;
            import com.google.firebase.analytics.connector.internal.zze;
            import com.google.firebase.analytics.connector.internal.zzg;
            import java.io.ByteArrayInputStream;
            import java.io.ByteArrayOutputStream;
            import java.io.IOException;
            import java.io.ObjectInputStream;
            import java.io.ObjectOutputStream;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            import java.util.concurrent.ConcurrentHashMap;
            import p000.C0986hc;
            import p000.a40;
            import p000.he3;
            import p000.kb1;
            import p000.li2;
            import p000.vi0;
            import p000.we0;
            import p000.xe0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 102 */   public class AnalyticsConnectorImpl implements AnalyticsConnector {
                private static volatile AnalyticsConnector zzc;
                final C0986hc zza;
                final Map zzb;

                public AnalyticsConnectorImpl(C0986hc c0986hc) {
/* 4 */             kb1.m6061n(c0986hc);
/* 7 */             this.zza = c0986hc;
/* 14 */            this.zzb = new ConcurrentHashMap();
                }

                public static AnalyticsConnector getInstance(vi0 vi0Var, Context context, li2 li2Var) {
                    boolean z;
/* 1 */             kb1.m6061n(vi0Var);
/* 4 */             kb1.m6061n(context);
/* 7 */             kb1.m6061n(li2Var);
/* 14 */            kb1.m6061n(context.getApplicationContext());
/* 19 */            if (zzc == null) {
                        synchronized (AnalyticsConnectorImpl.class) {
/* 26 */                    if (zzc == null) {
/* 31 */                        Bundle bundle = new Bundle(1);
/* 36 */                        vi0Var.m9274a();
/* 45 */                        if ("[DEFAULT]".equals(vi0Var.f18193b)) {
/* 53 */                            ((xe0) li2Var).m9756a(zzb.zza, zza.zza);
/* 58 */                            vi0Var.m9274a();
/* 67 */                            a40 a40Var = (a40) vi0Var.f18198g.get();
                                    synchronized (a40Var) {
/* 70 */                                z = a40Var.f78a;
                                    }
/* 73 */                            bundle.putBoolean("dataCollectionDefaultEnabled", z);
                                }
/* 95 */                        zzc = new AnalyticsConnectorImpl(zzfb.zza(context, bundle).zzb());
                            }
                        }
                    }
/* 101 */           return zzc;
                }

                public static void zza(we0 we0Var) {
/* 2 */             throw null;
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
                public final boolean zzb(String str) {
/* 5 */             if (str.isEmpty()) {
/* 23 */                return false;
                    }
/* 7 */             Map map = this.zzb;
                    return map.containsKey(str) && map.get(str) != null;
                }

                @Override // com.google.firebase.analytics.connector.AnalyticsConnector
                public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
/* 1 */             if (str2 == null || zzc.zzb(str2, bundle)) {
/* 14 */                this.zza.f9004a.zzm(str, str2, bundle);
                    }
                }

                @Override // com.google.firebase.analytics.connector.AnalyticsConnector
                public List<AnalyticsConnector.ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 22 */            for (Bundle bundle : this.zza.f9004a.zzn(str, str2)) {
/* 30 */                int i = zzc.zza;
/* 32 */                kb1.m6061n(bundle);
/* 37 */                AnalyticsConnector.ConditionalUserProperty conditionalUserProperty = new AnalyticsConnector.ConditionalUserProperty();
/* 49 */                String str3 = (String) he3.m4179A(bundle, FirebaseAnalytics.Param.ORIGIN, String.class, null);
/* 51 */                kb1.m6061n(str3);
/* 54 */                conditionalUserProperty.origin = str3;
/* 62 */                String str4 = (String) he3.m4179A(bundle, "name", String.class, null);
/* 64 */                kb1.m6061n(str4);
/* 67 */                conditionalUserProperty.name = str4;
/* 77 */                conditionalUserProperty.value = he3.m4179A(bundle, FirebaseAnalytics.Param.VALUE, Object.class, null);
/* 87 */                conditionalUserProperty.triggerEventName = (String) he3.m4179A(bundle, "trigger_event_name", String.class, null);
/* 109 */               conditionalUserProperty.triggerTimeout = ((Long) he3.m4179A(bundle, "trigger_timeout", Long.class, 0L)).longValue();
/* 119 */               conditionalUserProperty.timedOutEventName = (String) he3.m4179A(bundle, "timed_out_event_name", String.class, null);
/* 131 */               conditionalUserProperty.timedOutEventParams = (Bundle) he3.m4179A(bundle, "timed_out_event_params", Bundle.class, null);
/* 141 */               conditionalUserProperty.triggeredEventName = (String) he3.m4179A(bundle, "triggered_event_name", String.class, null);
/* 151 */               conditionalUserProperty.triggeredEventParams = (Bundle) he3.m4179A(bundle, "triggered_event_params", Bundle.class, null);
/* 165 */               conditionalUserProperty.timeToLive = ((Long) he3.m4179A(bundle, "time_to_live", Long.class, 0L)).longValue();
/* 175 */               conditionalUserProperty.expiredEventName = (String) he3.m4179A(bundle, "expired_event_name", String.class, null);
/* 185 */               conditionalUserProperty.expiredEventParams = (Bundle) he3.m4179A(bundle, "expired_event_params", Bundle.class, null);
/* 203 */               conditionalUserProperty.active = ((Boolean) he3.m4179A(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
/* 217 */               conditionalUserProperty.creationTimestamp = ((Long) he3.m4179A(bundle, "creation_timestamp", Long.class, 0L)).longValue();
/* 231 */               conditionalUserProperty.triggeredTimestamp = ((Long) he3.m4179A(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
/* 233 */               arrayList.add(conditionalUserProperty);
                    }
/* 238 */           return arrayList;
                }

                @Override // com.google.firebase.analytics.connector.AnalyticsConnector
                public int getMaxUserProperties(String str) {
/* 5 */             return this.zza.f9004a.zzF(str);
                }

                @Override // com.google.firebase.analytics.connector.AnalyticsConnector
                public Map<String, Object> getUserProperties(boolean z) {
/* 6 */             return this.zza.f9004a.zzC(null, null, z);
                }

                @Override // com.google.firebase.analytics.connector.AnalyticsConnector
                public void logEvent(String str, String str2, Bundle bundle) {
/* 1 */             if (bundle == null) {
/* 5 */                 bundle = new Bundle();
                    }
/* 12 */            if (zzc.zza(str) && zzc.zzb(str2, bundle) && zzc.zze(str, str2, bundle)) {
/* 33 */                if ("clx".equals(str) && "_ae".equals(str2)) {
/* 47 */                    bundle.putLong("_r", 1L);
                        }
/* 54 */                this.zza.f9004a.zzi(str, str2, bundle);
                    }
                }

                @Override // com.google.firebase.analytics.connector.AnalyticsConnector
                public AnalyticsConnector.AnalyticsConnectorHandle registerAnalyticsConnectorListener(final String str, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
                    com.google.firebase.analytics.connector.internal.zza zzgVar;
/* 1 */             kb1.m6061n(analyticsConnectorListener);
/* 9 */             if (zzc.zza(str) && !zzb(str)) {
/* 18 */                C0986hc c0986hc = this.zza;
/* 26 */                if ("fiam".equals(str)) {
/* 30 */                    zzgVar = new zze(c0986hc, analyticsConnectorListener);
                        } else {
/* 48 */                    zzgVar = "clx".equals(str) ? new zzg(c0986hc, analyticsConnectorListener) : null;
                        }
/* 49 */                if (zzgVar != null) {
/* 53 */                    this.zzb.put(str, zzgVar);
/* 58 */                    return new AnalyticsConnector.AnalyticsConnectorHandle(this) { // from class: com.google.firebase.analytics.connector.AnalyticsConnectorImpl.1
                                final /* synthetic */ AnalyticsConnectorImpl zzb;

                                {
/* 3 */                             Objects.requireNonNull(this);
/* 6 */                             this.zzb = this;
                                }

                                @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
                                public void registerEventNames(Set<String> set) {
/* 1 */                             AnalyticsConnectorImpl analyticsConnectorImpl = this.zzb;
/* 3 */                             String str2 = str;
/* 9 */                             if (!analyticsConnectorImpl.zzb(str2) || !str2.equals("fiam") || set == null || set.isEmpty()) {
/* 39 */                                return;
                                    }
/* 36 */                            ((com.google.firebase.analytics.connector.internal.zza) analyticsConnectorImpl.zzb.get(str2)).zzb(set);
                                }

                                @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
                                public final void unregister() {
/* 1 */                             AnalyticsConnectorImpl analyticsConnectorImpl = this.zzb;
/* 3 */                             String str2 = str;
/* 9 */                             if (analyticsConnectorImpl.zzb(str2)) {
/* 12 */                                Map map = analyticsConnectorImpl.zzb;
/* 20 */                                AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListenerZza = ((com.google.firebase.analytics.connector.internal.zza) map.get(str2)).zza();
/* 24 */                                if (analyticsConnectorListenerZza != null) {
/* 28 */                                    analyticsConnectorListenerZza.onMessageTriggered(0, null);
                                        }
/* 31 */                                map.remove(str2);
                                    }
                                }

                                @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorHandle
                                public void unregisterEventNames() {
/* 1 */                             AnalyticsConnectorImpl analyticsConnectorImpl = this.zzb;
/* 3 */                             String str2 = str;
/* 9 */                             if (analyticsConnectorImpl.zzb(str2) && str2.equals("fiam")) {
/* 28 */                                ((com.google.firebase.analytics.connector.internal.zza) analyticsConnectorImpl.zzb.get(str2)).zzc();
                                    }
                                }
                            };
                        }
                    }
/* 8 */             return null;
                }

                @Override // com.google.firebase.analytics.connector.AnalyticsConnector
                public void setConditionalUserProperty(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
                    String str;
                    Throwable th;
                    ObjectInputStream objectInputStream;
                    ObjectOutputStream objectOutputStream;
/* 1 */             int i = zzc.zza;
/* 3 */             if (conditionalUserProperty == null || (str = conditionalUserProperty.origin) == null || str.isEmpty()) {
/* 302 */               return;
                    }
/* 17 */            Object obj = conditionalUserProperty.value;
/* 19 */            if (obj != null) {
/* 21 */                Object obj2 = null;
                        try {
                            try {
/* 24 */                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 29 */                        objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                try {
/* 32 */                            objectOutputStream.writeObject(obj);
/* 35 */                            objectOutputStream.flush();
/* 49 */                            objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                                    try {
/* 52 */                                Object object = objectInputStream.readObject();
/* 56 */                                objectOutputStream.close();
/* 59 */                                objectInputStream.close();
/* 62 */                                obj2 = object;
/* 85 */                                if (obj2 == null) {
/* 302 */                                   return;
                                        }
                                    } catch (Throwable th2) {
/* 64 */                                th = th2;
/* 74 */                                if (objectOutputStream != null) {
/* 76 */                                    objectOutputStream.close();
                                        }
/* 79 */                                if (objectInputStream == null) {
/* 84 */                                    throw th;
                                        }
/* 81 */                                objectInputStream.close();
/* 84 */                                throw th;
                                    }
                                } catch (Throwable th3) {
/* 67 */                            th = th3;
/* 68 */                            objectInputStream = null;
                                }
                            } catch (IOException | ClassNotFoundException unused) {
                            }
                        } catch (Throwable th4) {
/* 71 */                    th = th4;
/* 72 */                    objectInputStream = null;
/* 73 */                    objectOutputStream = null;
                        }
                    }
/* 91 */            if (zzc.zza(str) && zzc.zzd(str, conditionalUserProperty.name)) {
/* 101 */               String str2 = conditionalUserProperty.expiredEventName;
/* 103 */               if (str2 == null || (zzc.zzb(str2, conditionalUserProperty.expiredEventParams) && zzc.zze(str, conditionalUserProperty.expiredEventName, conditionalUserProperty.expiredEventParams))) {
/* 123 */                   String str3 = conditionalUserProperty.triggeredEventName;
/* 125 */                   if (str3 == null || (zzc.zzb(str3, conditionalUserProperty.triggeredEventParams) && zzc.zze(str, conditionalUserProperty.triggeredEventName, conditionalUserProperty.triggeredEventParams))) {
/* 145 */                       String str4 = conditionalUserProperty.timedOutEventName;
/* 147 */                       if (str4 == null || (zzc.zzb(str4, conditionalUserProperty.timedOutEventParams) && zzc.zze(str, conditionalUserProperty.timedOutEventName, conditionalUserProperty.timedOutEventParams))) {
/* 167 */                           C0986hc c0986hc = this.zza;
/* 171 */                           Bundle bundle = new Bundle();
/* 174 */                           String str5 = conditionalUserProperty.origin;
/* 176 */                           if (str5 != null) {
/* 180 */                               bundle.putString(FirebaseAnalytics.Param.ORIGIN, str5);
                                    }
/* 183 */                           String str6 = conditionalUserProperty.name;
/* 185 */                           if (str6 != null) {
/* 189 */                               bundle.putString("name", str6);
                                    }
/* 192 */                           Object obj3 = conditionalUserProperty.value;
/* 194 */                           if (obj3 != null) {
/* 196 */                               he3.m4203z(bundle, obj3);
                                    }
/* 199 */                           String str7 = conditionalUserProperty.triggerEventName;
/* 201 */                           if (str7 != null) {
/* 205 */                               bundle.putString("trigger_event_name", str7);
                                    }
/* 212 */                           bundle.putLong("trigger_timeout", conditionalUserProperty.triggerTimeout);
/* 215 */                           String str8 = conditionalUserProperty.timedOutEventName;
/* 217 */                           if (str8 != null) {
/* 221 */                               bundle.putString("timed_out_event_name", str8);
                                    }
/* 224 */                           Bundle bundle2 = conditionalUserProperty.timedOutEventParams;
/* 226 */                           if (bundle2 != null) {
/* 230 */                               bundle.putBundle("timed_out_event_params", bundle2);
                                    }
/* 233 */                           String str9 = conditionalUserProperty.triggeredEventName;
/* 235 */                           if (str9 != null) {
/* 239 */                               bundle.putString("triggered_event_name", str9);
                                    }
/* 242 */                           Bundle bundle3 = conditionalUserProperty.triggeredEventParams;
/* 244 */                           if (bundle3 != null) {
/* 248 */                               bundle.putBundle("triggered_event_params", bundle3);
                                    }
/* 255 */                           bundle.putLong("time_to_live", conditionalUserProperty.timeToLive);
/* 258 */                           String str10 = conditionalUserProperty.expiredEventName;
/* 260 */                           if (str10 != null) {
/* 264 */                               bundle.putString("expired_event_name", str10);
                                    }
/* 267 */                           Bundle bundle4 = conditionalUserProperty.expiredEventParams;
/* 269 */                           if (bundle4 != null) {
/* 273 */                               bundle.putBundle("expired_event_params", bundle4);
                                    }
/* 280 */                           bundle.putLong("creation_timestamp", conditionalUserProperty.creationTimestamp);
/* 287 */                           bundle.putBoolean("active", conditionalUserProperty.active);
/* 294 */                           bundle.putLong("triggered_timestamp", conditionalUserProperty.triggeredTimestamp);
/* 299 */                           c0986hc.f9004a.zzl(bundle);
                                }
                            }
                        }
                    }
                }

                @Override // com.google.firebase.analytics.connector.AnalyticsConnector
                public void setUserProperty(String str, String str2, Object obj) {
/* 5 */             if (zzc.zza(str) && zzc.zzd(str, str2)) {
/* 19 */                this.zza.f9004a.zzk(str, str2, obj, true);
                    }
                }

/* 103 */       public static AnalyticsConnector getInstance(vi0 vi0Var) {
/* 104 */           return (AnalyticsConnector) vi0Var.m9275b(AnalyticsConnector.class);
                }

/* 104 */       public static AnalyticsConnector getInstance() {
/* 105 */           return getInstance(vi0.m9271c());
                }
            }
