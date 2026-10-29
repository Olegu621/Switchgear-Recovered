.class public final Ljv2;
.super Lb51;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lkv2;ILandroidx/recyclerview/widget/o;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ljv2;->a:I

    .line 3
    .line 4
    iput-object p1, p0, Ljv2;->c:Ljava/lang/Object;

    .line 5
    .line 6
    iput p2, p0, Ljv2;->b:I

    .line 7
    .line 8
    iput-object p3, p0, Ljv2;->d:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    invoke-direct {p0, p1}, Lb51;-><init>(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(Lrv2;Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Ljv2;->a:I

    .line 15
    iput-object p1, p0, Ljv2;->c:Ljava/lang/Object;

    iput-object p2, p0, Ljv2;->d:Ljava/lang/Object;

    iput p3, p0, Ljv2;->b:I

    invoke-direct {p0, v0}, Lb51;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Ljv2;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget v3, p0, Ljv2;->b:I

    .line 6
    .line 7
    iget-object v4, p0, Ljv2;->d:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object p0, p0, Ljv2;->c:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Number;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    check-cast p0, Lrv2;

    .line 21
    .line 22
    iget-object p0, p0, Lrv2;->c:Lv11;

    .line 23
    .line 24
    invoke-virtual {p0}, Lv11;->invoke()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    check-cast v4, Landroidx/recyclerview/widget/RecyclerView;

    .line 28
    .line 29
    filled-new-array {v2, v2}, [I

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {v4, p0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 34
    .line 35
    .line 36
    aget p0, p0, v1

    .line 37
    .line 38
    sub-int/2addr p1, p0

    .line 39
    sub-int/2addr p1, v3

    .line 40
    invoke-virtual {v4, v2, p1, v2}, Landroidx/recyclerview/widget/RecyclerView;->d0(IIZ)V

    .line 41
    .line 42
    .line 43
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    check-cast p0, Lkv2;

    .line 53
    .line 54
    iget-object v0, p0, Lkv2;->h:Ljava/util/LinkedHashSet;

    .line 55
    .line 56
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    if-eqz p1, :cond_0

    .line 64
    .line 65
    invoke-interface {v0, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    invoke-interface {v0, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    :goto_0
    if-eqz p1, :cond_1

    .line 73
    .line 74
    filled-new-array {v2, v2}, [I

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    check-cast v4, Landroidx/recyclerview/widget/o;

    .line 79
    .line 80
    iget-object v0, v4, Landroidx/recyclerview/widget/o;->a:Landroid/view/View;

    .line 81
    .line 82
    invoke-virtual {v0, p1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 83
    .line 84
    .line 85
    aget p1, p1, v1

    .line 86
    .line 87
    iget-object v0, p0, Lkv2;->f:Ljv2;

    .line 88
    .line 89
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-virtual {v0, p1}, Ljv2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    :cond_1
    iget-object p0, p0, Landroidx/recyclerview/widget/g;->a:Li12;

    .line 97
    .line 98
    invoke-virtual {p0, v3}, Li12;->c(I)V

    .line 99
    .line 100
    .line 101
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    return-object p0

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
