            package com.google.android.gms.dynamic;

            import android.app.Fragment;
            import android.content.Intent;
            import android.os.Bundle;
            import android.view.View;
            import p000.kb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class FragmentWrapper extends IFragmentWrapper.Stub {

                /* JADX INFO: renamed from: a */
                public final Fragment f3739a;

                public FragmentWrapper(Fragment fragment) {
/* 4 */             this.f3739a = fragment;
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                /* JADX INFO: renamed from: W */
                public final void mo2036W(Intent intent) {
/* 3 */             this.f3739a.startActivity(intent);
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                /* JADX INFO: renamed from: c0 */
                public final void mo2037c0(boolean z) {
/* 3 */             this.f3739a.setRetainInstance(z);
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                /* JADX INFO: renamed from: e */
                public final void mo2038e(boolean z) {
/* 3 */             this.f3739a.setHasOptionsMenu(z);
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                /* JADX INFO: renamed from: j0 */
                public final void mo2039j0(IObjectWrapper iObjectWrapper) {
/* 5 */             View view = (View) ObjectWrapper.m2045b(iObjectWrapper);
/* 7 */             kb1.m6061n(view);
/* 12 */            this.f3739a.registerForContextMenu(view);
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                /* JADX INFO: renamed from: k */
                public final void mo2040k(boolean z) {
/* 3 */             this.f3739a.setMenuVisibility(z);
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                /* JADX INFO: renamed from: m0 */
                public final void mo2041m0(IObjectWrapper iObjectWrapper) {
/* 5 */             View view = (View) ObjectWrapper.m2045b(iObjectWrapper);
/* 7 */             kb1.m6061n(view);
/* 12 */            this.f3739a.unregisterForContextMenu(view);
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                /* JADX INFO: renamed from: o0 */
                public final void mo2042o0(boolean z) {
/* 3 */             this.f3739a.setUserVisibleHint(z);
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                /* JADX INFO: renamed from: t */
                public final void mo2043t(int i, Intent intent) {
/* 3 */             this.f3739a.startActivityForResult(intent, i);
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final ObjectWrapper zzb() {
/* 9 */             return new ObjectWrapper(this.f3739a.getActivity());
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final Bundle zzc() {
/* 3 */             return this.f3739a.getArguments();
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final int zzd() {
/* 3 */             return this.f3739a.getId();
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final IFragmentWrapper zze() {
/* 3 */             Fragment parentFragment = this.f3739a.getParentFragment();
/* 7 */             if (parentFragment != null) {
/* 11 */                return new FragmentWrapper(parentFragment);
                    }
/* 15 */            return null;
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final ObjectWrapper zzf() {
/* 9 */             return new ObjectWrapper(this.f3739a.getResources());
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final boolean zzg() {
/* 3 */             return this.f3739a.getRetainInstance();
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final String zzh() {
/* 3 */             return this.f3739a.getTag();
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final IFragmentWrapper zzi() {
/* 3 */             Fragment targetFragment = this.f3739a.getTargetFragment();
/* 7 */             if (targetFragment != null) {
/* 11 */                return new FragmentWrapper(targetFragment);
                    }
/* 15 */            return null;
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final int zzj() {
/* 3 */             return this.f3739a.getTargetRequestCode();
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final boolean zzk() {
/* 3 */             return this.f3739a.getUserVisibleHint();
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final ObjectWrapper zzl() {
/* 9 */             return new ObjectWrapper(this.f3739a.getView());
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final boolean zzm() {
/* 3 */             return this.f3739a.isAdded();
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final boolean zzn() {
/* 3 */             return this.f3739a.isDetached();
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final boolean zzo() {
/* 3 */             return this.f3739a.isHidden();
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final boolean zzp() {
/* 3 */             return this.f3739a.isInLayout();
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final boolean zzq() {
/* 3 */             return this.f3739a.isRemoving();
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final boolean zzr() {
/* 3 */             return this.f3739a.isResumed();
                }

                @Override // com.google.android.gms.dynamic.IFragmentWrapper
                public final boolean zzs() {
/* 3 */             return this.f3739a.isVisible();
                }
            }
