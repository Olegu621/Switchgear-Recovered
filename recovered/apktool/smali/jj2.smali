.class public final synthetic Ljj2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lud;


# instance fields
.field public final synthetic a:Llj2;

.field public final synthetic b:Lkj2;

.field public final synthetic c:I

.field public final synthetic d:Lsg;

.field public final synthetic e:Lsg;


# direct methods
.method public synthetic constructor <init>(Llj2;Lkj2;ILsg;Lsg;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljj2;->a:Llj2;

    .line 5
    .line 6
    iput-object p2, p0, Ljj2;->b:Lkj2;

    .line 7
    .line 8
    iput p3, p0, Ljj2;->c:I

    .line 9
    .line 10
    iput-object p4, p0, Ljj2;->d:Lsg;

    .line 11
    .line 12
    iput-object p5, p0, Ljj2;->e:Lsg;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ls81;
    .locals 8

    .line 1
    iget-object v0, p0, Ljj2;->b:Lkj2;

    .line 2
    .line 3
    move-object v2, p1

    .line 4
    check-cast v2, Landroid/view/Surface;

    .line 5
    .line 6
    iget-object p1, p0, Ljj2;->a:Llj2;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const/4 v7, 0x1

    .line 15
    :try_start_0
    invoke-virtual {v0}, Ld70;->d()V
    :try_end_0
    .catch Lc70; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    new-instance v1, Lmj2;

    .line 19
    .line 20
    iget-object p1, p1, Llj2;->g:Lpg;

    .line 21
    .line 22
    iget-object v4, p1, Lpg;->a:Landroid/util/Size;

    .line 23
    .line 24
    iget v3, p0, Ljj2;->c:I

    .line 25
    .line 26
    iget-object v5, p0, Ljj2;->d:Lsg;

    .line 27
    .line 28
    iget-object v6, p0, Ljj2;->e:Lsg;

    .line 29
    .line 30
    invoke-direct/range {v1 .. v6}, Lmj2;-><init>(Landroid/view/Surface;ILandroid/util/Size;Lsg;Lsg;)V

    .line 31
    .line 32
    .line 33
    new-instance p0, Lgj2;

    .line 34
    .line 35
    invoke-direct {p0, v0, v7}, Lgj2;-><init>(Lkj2;I)V

    .line 36
    .line 37
    .line 38
    invoke-static {}, Lpg3;->g()Lo80;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iget-object v2, v1, Lmj2;->U:Lxm;

    .line 43
    .line 44
    iget-object v2, v2, Lxm;->b:Lwm;

    .line 45
    .line 46
    invoke-virtual {v2, p0, p1}, Ll0;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 47
    .line 48
    .line 49
    iget-object p0, v0, Lkj2;->r:Lmj2;

    .line 50
    .line 51
    if-nez p0, :cond_0

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_0
    const/4 v7, 0x0

    .line 55
    :goto_0
    const-string p0, "Consumer can only be linked once."

    .line 56
    .line 57
    invoke-static {p0, v7}, Lde3;->j(Ljava/lang/String;Z)V

    .line 58
    .line 59
    .line 60
    iput-object v1, v0, Lkj2;->r:Lmj2;

    .line 61
    .line 62
    invoke-static {v1}, Lw11;->t(Ljava/lang/Object;)Ltw0;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :catch_0
    move-exception v0

    .line 68
    move-object p0, v0

    .line 69
    new-instance p1, Ltw0;

    .line 70
    .line 71
    invoke-direct {p1, p0, v7}, Ltw0;-><init>(Ljava/lang/Object;I)V

    .line 72
    .line 73
    .line 74
    return-object p1
.end method
