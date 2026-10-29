            package com.google.android.gms.common.server.response;

            import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
            import p000.de3;
            import p000.kb1;
            import p000.wg0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class FastSafeParcelableJsonResponse extends wg0 implements SafeParcelable {
                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                public boolean equals(Object obj) {
/* 2 */             if (obj == null) {
/* 1 */                 return false;
                    }
/* 6 */             if (this == obj) {
/* 5 */                 return true;
                    }
/* 17 */            if (!getClass().isInstance(obj)) {
/* 1 */                 return false;
                    }
/* 20 */            wg0 wg0Var = (wg0) obj;
/* 38 */            for (FastJsonResponse$Field<?, ?> fastJsonResponse$Field : getFieldMappings().values()) {
/* 50 */                if (isFieldSet(fastJsonResponse$Field)) {
/* 56 */                    if (!wg0Var.isFieldSet(fastJsonResponse$Field) || !de3.m3029k(getFieldValue(fastJsonResponse$Field), wg0Var.getFieldValue(fastJsonResponse$Field))) {
/* 1 */                         return false;
                            }
                        } else if (wg0Var.isFieldSet(fastJsonResponse$Field)) {
/* 1 */                     return false;
                        }
                    }
/* 5 */             return true;
                }

                @Override // p000.wg0
                public Object getValueObject(String str) {
/* 1 */             return null;
                }

                public int hashCode() {
/* 13 */            int iHashCode = 0;
/* 18 */            for (FastJsonResponse$Field<?, ?> fastJsonResponse$Field : getFieldMappings().values()) {
/* 30 */                if (isFieldSet(fastJsonResponse$Field)) {
/* 34 */                    Object fieldValue = getFieldValue(fastJsonResponse$Field);
/* 38 */                    kb1.m6061n(fieldValue);
/* 45 */                    iHashCode = (iHashCode * 31) + fieldValue.hashCode();
                        }
                    }
/* 47 */            return iHashCode;
                }

                @Override // p000.wg0
                public boolean isPrimitiveFieldSet(String str) {
/* 1 */             return false;
                }
            }
