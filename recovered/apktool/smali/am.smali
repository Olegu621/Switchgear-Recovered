.class public final Lam;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final Companion:Lzl;

.field public static final c:Lej0;


# instance fields
.field public final a:Lur3;

.field public final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lzl;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lam;->Companion:Lzl;

    .line 7
    .line 8
    sget-object v0, Lej0;->a:Lej0;

    .line 9
    .line 10
    sput-object v0, Lam;->c:Lej0;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lcom/usercentrics/sdk/v2/settings/data/UsercentricsSettings;Lur3;Z)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lam;->a:Lur3;

    .line 8
    .line 9
    iput-boolean p3, p0, Lam;->b:Z

    .line 10
    .line 11
    return-void
.end method
