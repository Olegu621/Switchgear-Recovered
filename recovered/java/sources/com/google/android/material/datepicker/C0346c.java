            package com.google.android.material.datepicker;

            import java.util.ArrayList;
            import java.util.Iterator;
            
            /* JADX INFO: renamed from: com.google.android.material.datepicker.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C0346c implements InterfaceC0349f {
                @Override // com.google.android.material.datepicker.InterfaceC0349f
                /* JADX INFO: renamed from: a */
                public final boolean mo2306a(long j, ArrayList arrayList) {
/* 1 */             Iterator it = arrayList.iterator();
/* 9 */             while (it.hasNext()) {
/* 15 */                CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
/* 17 */                if (dateValidator != null && dateValidator.mo2287E0(j)) {
/* 26 */                    return true;
                        }
                    }
/* 28 */            return false;
                }

                @Override // com.google.android.material.datepicker.InterfaceC0349f
                public final int getId() {
/* 1 */             return 1;
                }
            }
