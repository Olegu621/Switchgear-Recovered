.class public final Lz61;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lf71;


# instance fields
.field public final a:Lb5;

.field public final b:Lg71;


# direct methods
.method public constructor <init>(Lg71;Lb5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz61;->b:Lg71;

    .line 5
    .line 6
    iput-object p2, p0, Lz61;->a:Lb5;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onDestroy(Lg71;)V
    .locals 4
    .annotation runtime Lzp1;
        value = .enum Lt61;->ON_DESTROY:Lt61;
    .end annotation

    .line 1
    iget-object p0, p0, Lz61;->a:Lb5;

    .line 2
    .line 3
    iget-object v0, p0, Lb5;->b:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    invoke-virtual {p0, p1}, Lb5;->q(Lg71;)Lz61;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    monitor-exit v0

    .line 13
    return-void

    .line 14
    :catchall_0
    move-exception p0

    .line 15
    goto :goto_1

    .line 16
    :cond_0
    invoke-virtual {p0, p1}, Lb5;->E(Lg71;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, p0, Lb5;->d:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Ljava/util/HashMap;

    .line 22
    .line 23
    invoke-virtual {p1, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Ljava/util/Set;

    .line 28
    .line 29
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, Lag;

    .line 44
    .line 45
    iget-object v3, p0, Lb5;->c:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v3, Ljava/util/HashMap;

    .line 48
    .line 49
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_1
    iget-object p0, p0, Lb5;->d:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p0, Ljava/util/HashMap;

    .line 56
    .line 57
    invoke-virtual {p0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    iget-object p0, v1, Lz61;->b:Lg71;

    .line 61
    .line 62
    invoke-interface {p0}, Lg71;->getLifecycle()Lv61;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {p0, v1}, Lv61;->b(Lf71;)V

    .line 67
    .line 68
    .line 69
    monitor-exit v0

    .line 70
    return-void

    .line 71
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    throw p0
.end method

.method public onStart(Lg71;)V
    .locals 0
    .annotation runtime Lzp1;
        value = .enum Lt61;->ON_START:Lt61;
    .end annotation

    .line 1
    iget-object p0, p0, Lz61;->a:Lb5;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lb5;->B(Lg71;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onStop(Lg71;)V
    .locals 0
    .annotation runtime Lzp1;
        value = .enum Lt61;->ON_STOP:Lt61;
    .end annotation

    .line 1
    iget-object p0, p0, Lz61;->a:Lb5;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lb5;->E(Lg71;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
