            package com.google.android.gms.dynamic;

            import android.content.Intent;
            import android.os.Bundle;
            import android.view.View;
            import androidx.fragment.app.Fragment;
            import p000.kb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class SupportFragmentWrapper extends IFragmentWrapper.Stub {

                /* JADX INFO: renamed from: a */
                public final Fragment f3741a;

                public SupportFragmentWrapper(Fragment fragment) {
/* 4 */             this.f3741a = fragment;
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                /* JADX INFO: renamed from: W */
                public final void mo2036W(Intent intent) {
/* 3 */             this.f3741a.startActivity(intent);
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                /* JADX INFO: renamed from: c0 */
                public final void mo2037c0(boolean z) {
/* 3 */             this.f3741a.setRetainInstance(z);
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                /* JADX INFO: renamed from: e */
                public final void mo2038e(boolean z) {
/* 3 */             this.f3741a.setHasOptionsMenu(z);
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                /* JADX INFO: renamed from: j0 */
                public final void mo2039j0(IObjectWrapper iObjectWrapper) {
/* 5 */             View view = (View) ObjectWrapper.m2045b(iObjectWrapper);
/* 7 */             kb1.m6061n(view);
/* 12 */            this.f3741a.registerForContextMenu(view);
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                /* JADX INFO: renamed from: k */
                public final void mo2040k(boolean z) {
/* 3 */             this.f3741a.setMenuVisibility(z);
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                /* JADX INFO: renamed from: m0 */
                public final void mo2041m0(IObjectWrapper iObjectWrapper) {
/* 5 */             View view = (View) ObjectWrapper.m2045b(iObjectWrapper);
/* 7 */             kb1.m6061n(view);
/* 12 */            this.f3741a.unregisterForContextMenu(view);
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                /* JADX INFO: renamed from: o0 */
                public final void mo2042o0(boolean z) {
/* 3 */             this.f3741a.setUserVisibleHint(z);
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                /* JADX INFO: renamed from: t */
                public final void mo2043t(int i, Intent intent) {
/* 3 */             this.f3741a.startActivityForResult(intent, i);
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final ObjectWrapper zzb() {
/* 9 */             return new ObjectWrapper(this.f3741a.getActivity());
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final Bundle zzc() {
/* 3 */             return this.f3741a.getArguments();
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final int zzd() {
/* 3 */             return this.f3741a.getId();
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final IFragmentWrapper zze() {
/* 3 */             Fragment parentFragment = this.f3741a.getParentFragment();
/* 7 */             if (parentFragment != null) {
/* 11 */                return new SupportFragmentWrapper(parentFragment);
                    }
/* 15 */            return null;
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final ObjectWrapper zzf() {
/* 9 */             return new ObjectWrapper(this.f3741a.getResources());
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final boolean zzg() {
/* 3 */             return this.f3741a.getRetainInstance();
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final String zzh() {
/* 3 */             return this.f3741a.getTag();
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final IFragmentWrapper zzi() {
/* 3 */             Fragment targetFragment = this.f3741a.getTargetFragment();
/* 7 */             if (targetFragment != null) {
/* 11 */                return new SupportFragmentWrapper(targetFragment);
                    }
/* 15 */            return null;
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final int zzj() {
/* 3 */             return this.f3741a.getTargetRequestCode();
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final boolean zzk() {
/* 3 */             return this.f3741a.getUserVisibleHint();
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final ObjectWrapper zzl() {
/* 9 */             return new ObjectWrapper(this.f3741a.getView());
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final boolean zzm() {
/* 3 */             return this.f3741a.isAdded();
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final boolean zzn() {
/* 3 */             return this.f3741a.isDetached();
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final boolean zzo() {
/* 3 */             return this.f3741a.isHidden();
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final boolean zzp() {
/* 3 */             return this.f3741a.isInLayout();
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final boolean zzq() {
/* 3 */             return this.f3741a.isRemoving();
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final boolean zzr() {
/* 3 */             return this.f3741a.isResumed();
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final boolean zzs() {
/* 3 */             return this.f3741a.isVisible();
                }
            }
