.class public abstract Landroidx/recyclerview/widget/g;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Li12;

.field public b:Z

.field public final c:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Li12;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/database/Observable;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/recyclerview/widget/g;->a:Li12;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Landroidx/recyclerview/widget/g;->b:Z

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    iput v0, p0, Landroidx/recyclerview/widget/g;->c:I

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public abstract a()I
.end method

.method public b(I)J
    .locals 0

    .line 1
    const-wide/16 p0, -0x1

    .line 2
    .line 3
    return-wide p0
.end method

.method public c(I)I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final d()V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/g;->a:Li12;

    .line 2
    .line 3
    invoke-virtual {p0}, Li12;->b()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public abstract e(Landroidx/recyclerview/widget/o;I)V
.end method

.method public abstract f(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/o;
.end method

.method public g(Landroidx/recyclerview/widget/o;)V
    .locals 0

    .line 1
    return-void
.end method
