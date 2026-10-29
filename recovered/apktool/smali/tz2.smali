.class public final Ltz2;
.super Ljava/lang/Exception;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final Companion:Lsz2;


# instance fields
.field public final a:Lvz2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lsz2;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ltz2;->Companion:Lsz2;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lvz2;)V
    .locals 1

    .line 1
    iget-object v0, p1, Lvz2;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Ltz2;->a:Lvz2;

    .line 7
    .line 8
    return-void
.end method
