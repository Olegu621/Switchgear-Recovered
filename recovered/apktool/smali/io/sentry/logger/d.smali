.class public final synthetic Lio/sentry/logger/d;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lio/sentry/logger/d;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lio/sentry/logger/d;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lio/sentry/logger/d;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/logger/d;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lio/sentry/metrics/c;

    .line 9
    .line 10
    iget-object v0, p0, Lio/sentry/metrics/c;->d:Lio/sentry/g5;

    .line 11
    .line 12
    iget-object p0, p0, Lio/sentry/metrics/c;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 13
    .line 14
    invoke-virtual {p0}, Lio/sentry/m6;->getShutdownTimeoutMillis()J

    .line 15
    .line 16
    .line 17
    move-result-wide v1

    .line 18
    invoke-virtual {v0, v1, v2}, Lio/sentry/g5;->a(J)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    check-cast p0, Lio/sentry/logger/e;

    .line 23
    .line 24
    iget-object v0, p0, Lio/sentry/logger/e;->d:Lio/sentry/g5;

    .line 25
    .line 26
    iget-object p0, p0, Lio/sentry/logger/e;->a:Lio/sentry/android/core/SentryAndroidOptions;

    .line 27
    .line 28
    invoke-virtual {p0}, Lio/sentry/m6;->getShutdownTimeoutMillis()J

    .line 29
    .line 30
    .line 31
    move-result-wide v1

    .line 32
    invoke-virtual {v0, v1, v2}, Lio/sentry/g5;->a(J)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
