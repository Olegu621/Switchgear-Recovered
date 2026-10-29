.class public final Lki1;
.super Lmo;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lki1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lki1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(ILso;)V
    .locals 7

    .line 1
    iget v0, p0, Lki1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lki1;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Ls53;

    .line 9
    .line 10
    iget-object p0, p0, Ls53;->a:Ljava/util/HashSet;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Lwy2;

    .line 27
    .line 28
    iget-object v0, v0, Lwy2;->m:Lfb2;

    .line 29
    .line 30
    iget-object v1, v0, Lfb2;->g:Ljr;

    .line 31
    .line 32
    iget-object v1, v1, Ljr;->d:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Lmo;

    .line 49
    .line 50
    new-instance v3, Lhh2;

    .line 51
    .line 52
    iget-object v4, v0, Lfb2;->g:Ljr;

    .line 53
    .line 54
    iget-object v4, v4, Ljr;->f:Lnm2;

    .line 55
    .line 56
    const-wide/16 v5, -0x1

    .line 57
    .line 58
    invoke-direct {v3, p2, v5, v6, v4}, Lhh2;-><init>(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, p1, v3}, Lmo;->b(ILso;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    return-void

    .line 66
    :pswitch_0
    iget-object p0, p0, Lki1;->b:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast p0, Lli1;

    .line 69
    .line 70
    iget-object p1, p0, Lli1;->a:Ljava/lang/Object;

    .line 71
    .line 72
    monitor-enter p1

    .line 73
    :try_start_0
    iget-boolean v0, p0, Lli1;->e:Z

    .line 74
    .line 75
    if-eqz v0, :cond_2

    .line 76
    .line 77
    monitor-exit p1

    .line 78
    goto :goto_1

    .line 79
    :catchall_0
    move-exception p0

    .line 80
    goto :goto_2

    .line 81
    :cond_2
    iget-object v0, p0, Lli1;->w:Landroid/util/LongSparseArray;

    .line 82
    .line 83
    invoke-interface {p2}, Lso;->b()J

    .line 84
    .line 85
    .line 86
    move-result-wide v1

    .line 87
    new-instance v3, Lto;

    .line 88
    .line 89
    invoke-direct {v3, p2}, Lto;-><init>(Lso;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v1, v2, v3}, Landroid/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Lli1;->j()V

    .line 96
    .line 97
    .line 98
    monitor-exit p1

    .line 99
    :goto_1
    return-void

    .line 100
    :goto_2
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 101
    throw p0

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
