            package com.google.android.recaptcha.internal;

            import java.text.SimpleDateFormat;
            import java.util.Date;
            import java.util.GregorianCalendar;
            import java.util.Locale;
            import java.util.TimeZone;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzvk extends ThreadLocal {
                @Override // java.lang.ThreadLocal
                public final /* synthetic */ Object initialValue() {
/* 1 */             int i = zzvl.zza;
/* 9 */             SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
/* 20 */            GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
/* 30 */            gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
/* 33 */            simpleDateFormat.setCalendar(gregorianCalendar);
/* 36 */            return simpleDateFormat;
                }
            }
