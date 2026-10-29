.class public final Lg3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ld71;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lc3;

.field public final synthetic c:Ld3;

.field public final synthetic d:Lk3;


# direct methods
.method public constructor <init>(Lk3;Ljava/lang/String;Lc3;Ld3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lg3;->d:Lk3;

    .line 5
    .line 6
    iput-object p2, p0, Lg3;->a:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lg3;->b:Lc3;

    .line 9
    .line 10
    iput-object p4, p0, Lg3;->c:Ld3;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onStateChanged(Lg71;Lt61;)V
    .locals 4

    .line 1
    sget-object p1, Lt61;->ON_START:Lt61;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iget-object v0, p0, Lg3;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v1, p0, Lg3;->d:Lk3;

    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    iget-object p1, v1, Lk3;->e:Ljava/util/HashMap;

    .line 14
    .line 15
    iget-object p2, v1, Lk3;->g:Landroid/os/Bundle;

    .line 16
    .line 17
    iget-object v1, v1, Lk3;->f:Ljava/util/HashMap;

    .line 18
    .line 19
    new-instance v2, Li3;

    .line 20
    .line 21
    iget-object v3, p0, Lg3;->c:Ld3;

    .line 22
    .line 23
    iget-object p0, p0, Lg3;->b:Lc3;

    .line 24
    .line 25
    invoke-direct {v2, v3, p0}, Li3;-><init>(Ld3;Lc3;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_0

    .line 36
    .line 37
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    invoke-interface {p0, p1}, Lc3;->c(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, Landroidx/activity/result/ActivityResult;

    .line 52
    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    invoke-virtual {p2, v0}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iget p2, p1, Landroidx/activity/result/ActivityResult;->a:I

    .line 59
    .line 60
    iget-object p1, p1, Landroidx/activity/result/ActivityResult;->b:Landroid/content/Intent;

    .line 61
    .line 62
    invoke-virtual {v3, p2, p1}, Ld3;->c(ILandroid/content/Intent;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-interface {p0, p1}, Lc3;->c(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_1
    sget-object p0, Lt61;->ON_STOP:Lt61;

    .line 71
    .line 72
    invoke-virtual {p0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    if-eqz p0, :cond_2

    .line 77
    .line 78
    iget-object p0, v1, Lk3;->e:Ljava/util/HashMap;

    .line 79
    .line 80
    invoke-virtual {p0, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_2
    sget-object p0, Lt61;->ON_DESTROY:Lt61;

    .line 85
    .line 86
    invoke-virtual {p0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    if-eqz p0, :cond_3

    .line 91
    .line 92
    invoke-virtual {v1, v0}, Lk3;->f(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :cond_3
    return-void
.end method
