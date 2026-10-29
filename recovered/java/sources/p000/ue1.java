            package p000;

            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import android.os.RemoteException;
            import android.support.v4.media.MediaBrowserCompat;
            import android.support.v4.media.session.MediaControllerCompat;
            import android.view.KeyEvent;
            import io.sentry.android.core.AbstractC1245n0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ue1 extends MediaBrowserCompat.ConnectionCallback {

                /* JADX INFO: renamed from: a */
                public final Context f17485a;

                /* JADX INFO: renamed from: b */
                public final Intent f17486b;

                /* JADX INFO: renamed from: c */
                public final BroadcastReceiver.PendingResult f17487c;

                /* JADX INFO: renamed from: d */
                public MediaBrowserCompat f17488d;

                public ue1(Context context, Intent intent, BroadcastReceiver.PendingResult pendingResult) {
/* 4 */             this.f17485a = context;
/* 6 */             this.f17486b = intent;
/* 8 */             this.f17487c = pendingResult;
                }

                @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
                public final void onConnected() {
                    try {
/* 24 */                new MediaControllerCompat(this.f17485a, this.f17488d.getSessionToken()).dispatchMediaButtonEvent((KeyEvent) this.f17486b.getParcelableExtra("android.intent.extra.KEY_EVENT"));
                    } catch (RemoteException e) {
/* 33 */                AbstractC1245n0.m4877e("MediaButtonReceiver", "Failed to create a media controller", e);
                    }
/* 38 */            this.f17488d.disconnect();
/* 43 */            this.f17487c.finish();
                }

                @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
                public final void onConnectionFailed() {
/* 3 */             this.f17488d.disconnect();
/* 8 */             this.f17487c.finish();
                }

                @Override // android.support.v4.media.MediaBrowserCompat.ConnectionCallback
                public final void onConnectionSuspended() {
/* 3 */             this.f17488d.disconnect();
/* 8 */             this.f17487c.finish();
                }
            }
