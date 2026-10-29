.class public final synthetic Lio/sentry/w5;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lio/sentry/util/f;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/sentry/m6;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/m6;I)V
    .locals 0

    .line 1
    iput p2, p0, Lio/sentry/w5;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lio/sentry/w5;->b:Lio/sentry/m6;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lio/sentry/w5;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lio/sentry/w5;->b:Lio/sentry/m6;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lio/sentry/m6;->b(Lio/sentry/m6;)Lio/sentry/a0;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :pswitch_0
    new-instance v0, Lio/sentry/h2;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Lio/sentry/h2;-><init>(Lio/sentry/m6;)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :pswitch_1
    invoke-static {p0}, Lio/sentry/m6;->a(Lio/sentry/m6;)Lio/sentry/z;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
