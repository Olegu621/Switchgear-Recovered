.class public final synthetic Lnq;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lc00;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lnq;->a:I

    .line 2
    .line 3
    iput-object p2, p0, Lnq;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lnq;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Lnq;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, Lnq;->c:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object p0, p0, Lnq;->b:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, Lfe2;

    .line 12
    .line 13
    check-cast v2, Landroid/app/Activity;

    .line 14
    .line 15
    check-cast p1, Landroid/content/res/Configuration;

    .line 16
    .line 17
    iget-object p1, p0, Lfe2;->e:Lac1;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0, v2}, Lfe2;->a(Landroid/app/Activity;)Lq83;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p1, v2, p0}, Lac1;->I(Landroid/app/Activity;Lq83;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void

    .line 29
    :pswitch_0
    check-cast p0, Lcb0;

    .line 30
    .line 31
    check-cast v2, Lmj2;

    .line 32
    .line 33
    check-cast p1, Ltg;

    .line 34
    .line 35
    invoke-virtual {v2}, Lmj2;->close()V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcb0;->h:Ljava/util/LinkedHashMap;

    .line 39
    .line 40
    invoke-interface {p1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Landroid/view/Surface;

    .line 45
    .line 46
    if-eqz p1, :cond_1

    .line 47
    .line 48
    iget-object p0, p0, Lcb0;->a:Lab0;

    .line 49
    .line 50
    iget-object v0, p0, Ljq1;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 51
    .line 52
    invoke-static {v0, v1}, Lsp0;->d(Ljava/util/concurrent/atomic/AtomicBoolean;Z)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, Ljq1;->c:Ljava/lang/Thread;

    .line 56
    .line 57
    invoke-static {v0}, Lsp0;->c(Ljava/lang/Thread;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, p1, v1}, Ljq1;->i(Landroid/view/Surface;Z)V

    .line 61
    .line 62
    .line 63
    :cond_1
    return-void

    .line 64
    :pswitch_1
    check-cast p0, Lx60;

    .line 65
    .line 66
    check-cast v2, Lmj2;

    .line 67
    .line 68
    check-cast p1, Ltg;

    .line 69
    .line 70
    invoke-virtual {v2}, Lmj2;->close()V

    .line 71
    .line 72
    .line 73
    iget-object p1, p0, Lx60;->h:Ljava/util/LinkedHashMap;

    .line 74
    .line 75
    invoke-interface {p1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    check-cast p1, Landroid/view/Surface;

    .line 80
    .line 81
    if-eqz p1, :cond_2

    .line 82
    .line 83
    iget-object p0, p0, Lx60;->a:Ljq1;

    .line 84
    .line 85
    iget-object v0, p0, Ljq1;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 86
    .line 87
    invoke-static {v0, v1}, Lsp0;->d(Ljava/util/concurrent/atomic/AtomicBoolean;Z)V

    .line 88
    .line 89
    .line 90
    iget-object v0, p0, Ljq1;->c:Ljava/lang/Thread;

    .line 91
    .line 92
    invoke-static {v0}, Lsp0;->c(Ljava/lang/Thread;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0, p1, v1}, Ljq1;->i(Landroid/view/Surface;Z)V

    .line 96
    .line 97
    .line 98
    :cond_2
    return-void

    .line 99
    :pswitch_2
    check-cast p0, Landroid/view/Surface;

    .line 100
    .line 101
    check-cast v2, Landroid/graphics/SurfaceTexture;

    .line 102
    .line 103
    check-cast p1, Lqj2;

    .line 104
    .line 105
    invoke-virtual {p0}, Landroid/view/Surface;->release()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, Landroid/graphics/SurfaceTexture;->release()V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    nop

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
