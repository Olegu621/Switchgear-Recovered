.class public abstract Lc73;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# static fields
.field public static final a:Ler0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ler0;

    .line 2
    .line 3
    sget-object v1, Ld73;->a:Le73;

    .line 4
    .line 5
    invoke-interface {v1}, Le73;->getWebkitToCompatConverter()Lorg/chromium/support_lib_boundary/WebkitToCompatConverterBoundaryInterface;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/16 v2, 0x1a

    .line 10
    .line 11
    invoke-direct {v0, v1, v2}, Ler0;-><init>(Ljava/lang/Object;I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lc73;->a:Ler0;

    .line 15
    .line 16
    return-void
.end method
