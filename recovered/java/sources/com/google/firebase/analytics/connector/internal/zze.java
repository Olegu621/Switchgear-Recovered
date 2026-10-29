            package com.google.firebase.analytics.connector.internal;

            import com.google.firebase.analytics.connector.AnalyticsConnector;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.Set;
            import p000.C0986hc;
            import p000.i13;
            import p000.qj3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zze implements zza {
                final Set zza;
                private final AnalyticsConnector.AnalyticsConnectorListener zzb;
                private final C0986hc zzc;
                private final zzd zzd;

                public zze(C0986hc c0986hc, AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
/* 4 */             this.zzb = analyticsConnectorListener;
/* 6 */             this.zzc = c0986hc;
/* 10 */            zzd zzdVar = new zzd(this);
/* 13 */            this.zzd = zzdVar;
/* 17 */            c0986hc.f9004a.zzf(zzdVar);
/* 25 */            this.zza = new HashSet();
                }

                @Override // com.google.firebase.analytics.connector.internal.zza
                public final AnalyticsConnector.AnalyticsConnectorListener zza() {
/* 1 */             return this.zzb;
                }

                @Override // com.google.firebase.analytics.connector.internal.zza
                public final void zzb(Set set) {
/* 1 */             Set set2 = this.zza;
/* 3 */             set2.clear();
/* 8 */             HashSet hashSet = new HashSet();
/* 11 */            Iterator it = set.iterator();
/* 19 */            while (it.hasNext()) {
/* 25 */                String str = (String) it.next();
/* 33 */                if (hashSet.size() >= 50) {
                            break;
                        }
/* 37 */                int i = zzc.zza;
/* 39 */                if (str != null && str.length() != 0) {
/* 50 */                    int iCodePointAt = str.codePointAt(0);
/* 60 */                    if (!Character.isLetter(iCodePointAt)) {
/* 62 */                        if (iCodePointAt == 95) {
/* 65 */                            iCodePointAt = 95;
                                }
                            }
/* 66 */                    int length = str.length();
/* 70 */                    int iCharCount = Character.charCount(iCodePointAt);
                            while (true) {
/* 74 */                        if (iCharCount >= length) {
/* 99 */                            if (str.length() == 0) {
                                        break;
                                    }
/* 101 */                           int iCodePointAt2 = str.codePointAt(0);
/* 109 */                           if (!Character.isLetter(iCodePointAt2)) {
                                        break;
                                    }
/* 111 */                           int length2 = str.length();
/* 115 */                           int iCharCount2 = Character.charCount(iCodePointAt2);
                                    while (true) {
/* 119 */                               if (iCharCount2 < length2) {
/* 121 */                                   int iCodePointAt3 = str.codePointAt(iCharCount2);
/* 125 */                                   if (iCodePointAt3 != 95 && !Character.isLetterOrDigit(iCodePointAt3)) {
                                                break;
                                            } else {
/* 137 */                                       iCharCount2 += Character.charCount(iCodePointAt3);
                                            }
                                        } else {
/* 143 */                                   String strM7889V = qj3.m7889V(str, i13.f9403f, i13.f9405h);
/* 147 */                                   if (strM7889V != null) {
/* 150 */                                       str = strM7889V;
                                            }
/* 151 */                                   hashSet.add(str);
                                            break;
                                        }
                                    }
                                } else {
/* 76 */                            int iCodePointAt4 = str.codePointAt(iCharCount);
/* 80 */                            if (iCodePointAt4 != 95 && !Character.isLetterOrDigit(iCodePointAt4)) {
                                        break;
                                    } else {
/* 93 */                                iCharCount += Character.charCount(iCodePointAt4);
                                    }
                                }
                            }
                        }
                    }
/* 156 */           set2.addAll(hashSet);
                }

                @Override // com.google.firebase.analytics.connector.internal.zza
                public final void zzc() {
/* 3 */             this.zza.clear();
                }

                public final /* synthetic */ AnalyticsConnector.AnalyticsConnectorListener zzd() {
/* 1 */             return this.zzb;
                }
            }
