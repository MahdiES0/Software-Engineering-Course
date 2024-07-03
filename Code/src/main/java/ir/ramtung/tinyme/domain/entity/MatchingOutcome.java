package ir.ramtung.tinyme.domain.entity;

public enum MatchingOutcome {
    EXECUTED,
    NOT_ENOUGH_CREDIT,
    NOT_ENOUGH_POSITIONS,
    INVALID_MIN_EXEC_QUANTITY,
    MIN_EXEC_QUANTITY_HAVE_NOT_MET,
    CHANGING_MIN_EXEC_QUANTITY_IN_UPDATE_REQUEST,
    STOP_LIMIT_ORDER_QUEUED,
    STOP_LIMIT_ORDER_EXECUTED,
    STOP_LIMIT_ORDER_EXECUTED_DIRECTLY,
    INVALID_STOP_LIMIT_ORDER,
    STOP_LIMIT_ORDER_UPDATED,
    ORDER_ADDED_TO_AUCTION,
    CANNOT_CHANGE_STOP_LIMIT_ORDER_FOR_AUCTION_SECURITY,
    AUCTION_ORDER_BOOK_CHANGED,
    CANNOT_ADD_MIN_EXEC_QUANTITY_TO_AUCTION_ORDER,
    INVALID_OPENING_PRICE,
    OPENED
}