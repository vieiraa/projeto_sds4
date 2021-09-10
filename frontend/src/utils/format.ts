import { format } from 'date-fns'
export function round(value: number, precision: number) {
    const multiplier = Math.pow(10, precision || 0)
    return Math.round(value * multiplier) / multiplier
}

export function formatLocalDate(date: string, pattern: string) {
    const d = new Date(date)
    const dateOnly = new Date(d.valueOf() + d.getTimezoneOffset() * 60 * 1000)
    return format(dateOnly, pattern)
}
