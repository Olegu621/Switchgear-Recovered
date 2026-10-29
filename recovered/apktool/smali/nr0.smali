.class public final Lnr0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final c:Lnr0;


# instance fields
.field public final a:Lxt0;

.field public final b:Landroid/os/Looper;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lxt0;

    .line 2
    .line 3
    const/16 v1, 0x10

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lxt0;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lnr0;

    .line 13
    .line 14
    invoke-direct {v2, v0, v1}, Lnr0;-><init>(Lxt0;Landroid/os/Looper;)V

    .line 15
    .line 16
    .line 17
    sput-object v2, Lnr0;->c:Lnr0;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>(Lxt0;Landroid/os/Looper;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnr0;->a:Lxt0;

    .line 5
    .line 6
    iput-object p2, p0, Lnr0;->b:Landroid/os/Looper;

    .line 7
    .line 8
    return-void
.end method
