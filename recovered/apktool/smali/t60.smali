.class public final Lt60;
.super Lb51;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/g;Landroid/view/ViewGroup;Ljava/lang/Object;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lt60;->a:I

    .line 3
    .line 4
    iput-object p1, p0, Lt60;->c:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lt60;->d:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, Lt60;->b:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-direct {p0, v0}, Lb51;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lio/sentry/android/replay/capture/c;I)V
    .locals 0

    .line 14
    iput p4, p0, Lt60;->a:I

    iput-object p1, p0, Lt60;->b:Ljava/lang/Object;

    iput-object p2, p0, Lt60;->c:Ljava/lang/Object;

    iput-object p3, p0, Lt60;->d:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lb51;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lt60;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lt60;->d:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lt60;->c:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v2, Lio/sentry/n6;

    .line 11
    .line 12
    check-cast v1, Lio/sentry/android/replay/capture/c;

    .line 13
    .line 14
    iget-object p0, v1, Lio/sentry/android/replay/capture/c;->h:Lio/sentry/android/replay/k;

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    const-string v0, "replay.type"

    .line 19
    .line 20
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {p0, v0, v1}, Lio/sentry/android/replay/k;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    check-cast v2, Ljava/lang/Integer;

    .line 31
    .line 32
    check-cast v1, Lio/sentry/android/replay/capture/c;

    .line 33
    .line 34
    iget-object p0, v1, Lio/sentry/android/replay/capture/c;->h:Lio/sentry/android/replay/k;

    .line 35
    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    const-string v0, "segment.id"

    .line 39
    .line 40
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {p0, v0, v1}, Lio/sentry/android/replay/k;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_1
    check-cast v2, Landroidx/fragment/app/g;

    .line 51
    .line 52
    iget-object v0, v2, Landroidx/fragment/app/g;->f:Lln0;

    .line 53
    .line 54
    check-cast v1, Landroid/view/ViewGroup;

    .line 55
    .line 56
    iget-object p0, p0, Lt60;->b:Ljava/lang/Object;

    .line 57
    .line 58
    invoke-virtual {v0, v1, p0}, Lln0;->c(Landroid/view/ViewGroup;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
