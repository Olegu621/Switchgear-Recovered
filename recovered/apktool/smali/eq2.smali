.class public final Leq2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lsg0;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;

.field public i:Ljava/lang/Object;


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, Leq2;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljavax/inject/Provider;

    .line 4
    .line 5
    invoke-interface {v0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/content/Context;

    .line 10
    .line 11
    iget-object v1, p0, Leq2;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Ljavax/inject/Provider;

    .line 14
    .line 15
    invoke-interface {v1}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lei1;

    .line 20
    .line 21
    iget-object v2, p0, Leq2;->c:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Ljavax/inject/Provider;

    .line 24
    .line 25
    invoke-interface {v2}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Ls52;

    .line 30
    .line 31
    iget-object v3, p0, Leq2;->d:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v3, Lac1;

    .line 34
    .line 35
    invoke-virtual {v3}, Lac1;->get()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    check-cast v3, Lec;

    .line 40
    .line 41
    iget-object v4, p0, Leq2;->e:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v4, Ljavax/inject/Provider;

    .line 44
    .line 45
    invoke-interface {v4}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    check-cast v4, Ljava/util/concurrent/Executor;

    .line 50
    .line 51
    iget-object v5, p0, Leq2;->f:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v5, Ljavax/inject/Provider;

    .line 54
    .line 55
    invoke-interface {v5}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    check-cast v5, Ls52;

    .line 60
    .line 61
    new-instance v6, Lq62;

    .line 62
    .line 63
    const/16 v7, 0x9

    .line 64
    .line 65
    invoke-direct {v6, v7}, Lq62;-><init>(I)V

    .line 66
    .line 67
    .line 68
    new-instance v7, Lp62;

    .line 69
    .line 70
    const/16 v8, 0x8

    .line 71
    .line 72
    invoke-direct {v7, v8}, Lp62;-><init>(I)V

    .line 73
    .line 74
    .line 75
    iget-object p0, p0, Leq2;->i:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast p0, Ljavax/inject/Provider;

    .line 78
    .line 79
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    check-cast p0, Ls52;

    .line 84
    .line 85
    new-instance v8, Lf31;

    .line 86
    .line 87
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 88
    .line 89
    .line 90
    iput-object v0, v8, Lf31;->a:Ljava/lang/Object;

    .line 91
    .line 92
    iput-object v1, v8, Lf31;->b:Ljava/lang/Object;

    .line 93
    .line 94
    iput-object v2, v8, Lf31;->c:Ljava/lang/Object;

    .line 95
    .line 96
    iput-object v3, v8, Lf31;->d:Ljava/lang/Object;

    .line 97
    .line 98
    iput-object v4, v8, Lf31;->e:Ljava/lang/Object;

    .line 99
    .line 100
    iput-object v5, v8, Lf31;->f:Ljava/lang/Object;

    .line 101
    .line 102
    iput-object v6, v8, Lf31;->g:Ljava/lang/Object;

    .line 103
    .line 104
    iput-object v7, v8, Lf31;->h:Ljava/lang/Object;

    .line 105
    .line 106
    iput-object p0, v8, Lf31;->i:Ljava/lang/Object;

    .line 107
    .line 108
    return-object v8
.end method
