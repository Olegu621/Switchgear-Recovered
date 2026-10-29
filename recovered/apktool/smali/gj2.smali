.class public final synthetic Lgj2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lkj2;


# direct methods
.method public synthetic constructor <init>(Lkj2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lgj2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lgj2;->b:Lkj2;

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
    .locals 2

    .line 1
    iget v0, p0, Lgj2;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lgj2;->b:Lkj2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lkj2;->r:Lmj2;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lmj2;->g()V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lkj2;->q:Ld70;

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    iget-object p0, p0, Lkj2;->p:Lum;

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    iput-boolean v0, p0, Lum;->d:Z

    .line 23
    .line 24
    iget-object v1, p0, Lum;->b:Lxm;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    iget-object v1, v1, Lxm;->b:Lwm;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Ll0;->cancel(Z)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    iput-object v0, p0, Lum;->a:Ljava/lang/Object;

    .line 38
    .line 39
    iput-object v0, p0, Lum;->b:Lxm;

    .line 40
    .line 41
    iput-object v0, p0, Lum;->c:Lu32;

    .line 42
    .line 43
    :cond_1
    return-void

    .line 44
    :pswitch_0
    invoke-virtual {p0}, Ld70;->b()V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_1
    invoke-virtual {p0}, Lkj2;->a()V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
