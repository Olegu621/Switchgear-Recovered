.class public abstract Lom0;
.super Lmm0;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Landroidx/fragment/app/FragmentActivity;

.field public final b:Landroidx/fragment/app/FragmentActivity;

.field public final c:Landroid/os/Handler;

.field public final d:Lvm0;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/FragmentActivity;)V
    .locals 1

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lom0;->a:Landroidx/fragment/app/FragmentActivity;

    .line 10
    .line 11
    iput-object p1, p0, Lom0;->b:Landroidx/fragment/app/FragmentActivity;

    .line 12
    .line 13
    iput-object v0, p0, Lom0;->c:Landroid/os/Handler;

    .line 14
    .line 15
    new-instance p1, Lvm0;

    .line 16
    .line 17
    invoke-direct {p1}, Landroidx/fragment/app/w;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, Lom0;->d:Lvm0;

    .line 21
    .line 22
    return-void
.end method
